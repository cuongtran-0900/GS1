CREATE DATABASE QLCUAHANGTIENLOI;
USE QLCUAHANGTIENLOI;

CREATE TABLE Account (
    AccountId INT IDENTITY(1,1) PRIMARY KEY,
    Username VARCHAR(50) NOT NULL,
    Pass VARCHAR(20) NOT NULL,
    Roles BIT NOT NULL,
    Fullname NVARCHAR(50) NOT NULL,
    UserAddress NVARCHAR(50) NOT NULL,
    Phone VARCHAR(15) NOT NULL,
    Email NVARCHAR(50) NOT NULL
);

CREATE TABLE Timesheet (
    TimesheetId INT IDENTITY(1,1) PRIMARY KEY,
    AccountId INT NOT NULL,
    Worked BIT DEFAULT 0,
    CheckIn DATETIME NOT NULL,
    CheckOut DATETIME NOT NULL
);

CREATE TABLE ProductType (
    TypeId INT IDENTITY(1,1) PRIMARY KEY,
    TypeName NVARCHAR(15) NOT NULL
);

CREATE TABLE Product (
    ProductId INT IDENTITY(1,1) PRIMARY KEY,
    TypeId INT NOT NULL,
    ProductName NVARCHAR(50) NOT NULL,
    Unit NVARCHAR(10) NOT NULL,
    Price FLOAT NOT NULL,
    Images VARCHAR(255) NOT NULL
);

CREATE TABLE Customer (
    CustomerId INT IDENTITY(1,1) PRIMARY KEY,
    CustomerName NVARCHAR(50) NOT NULL,
    CustomerAddress NVARCHAR(50) NOT NULL,
    Phone VARCHAR(15) NOT NULL,
    Point INT DEFAULT 0
);

CREATE TABLE Bill (
    BillId INT IDENTITY(1,1) PRIMARY KEY,
    AccountId INT NOT NULL,
    CreatedDate DATE NOT NULL,
    CustomerId INT,
    TotalPrice FLOAT NOT NULL
);

CREATE TABLE BillDetail (
    DetailId INT IDENTITY(1,1) PRIMARY KEY,
    BillId INT NOT NULL,
    ProductId INT,
    Quantity INT NOT NULL,
    Subtotal FLOAT NOT NULL
);

-- Thêm các khóa ngoại
ALTER TABLE Timesheet ADD CONSTRAINT FK_Timesheet_Account FOREIGN KEY (AccountId) REFERENCES Account(AccountId);
ALTER TABLE Product ADD CONSTRAINT FK_Product_ProductType FOREIGN KEY (TypeId) REFERENCES ProductType(TypeId);
ALTER TABLE Bill ADD CONSTRAINT FK_Bill_Account FOREIGN KEY (AccountId) REFERENCES Account(AccountId);
ALTER TABLE Bill ADD CONSTRAINT FK_Bill_Customer FOREIGN KEY (CustomerId) REFERENCES Customer(CustomerId);
ALTER TABLE BillDetail ADD CONSTRAINT FK_BillDetail_Bill FOREIGN KEY (BillId) REFERENCES Bill(BillId);
ALTER TABLE BillDetail ADD CONSTRAINT FK_BillDetail_Product FOREIGN KEY (ProductId) REFERENCES Product(ProductId);

-- Thêm dữ liệu mẫu cho bảng Account
INSERT INTO Account (Username, Pass, Roles, Fullname, UserAddress, Phone, Email)
VALUES 
('lva', 'lva', 1, N'Lê Văn A', N'Hà Nội', '0123456789', 'lva@example.com'),
('nlthm', 'nlthm', 0, N'Nguyễn Lê Thị Hồng Minh', N'Hồ Chí Minh', '0987654321', 'nlthm@example.com'),
('ldk', 'ldk', 0, N'Lê Đức Khải', N'Đà Nẵng', '0369852147', 'ldk@example.com'),
('nvp', 'nvp', 0, N'Nguyễn Văn Phú', N'Hải Phòng', '0741852963', 'nvp@example.com');

-- Thêm dữ liệu mẫu cho bảng ProductType
INSERT INTO ProductType (TypeName)
VALUES 
(N'Thực phẩm'),
(N'Đồ uống'),
(N'Đồ gia dụng'),
(N'Văn phòng phẩm');

-- Thêm dữ liệu mẫu cho bảng Product
INSERT INTO Product (TypeId, ProductName, Unit, Price, Images)
VALUES 
(1, N'Bánh mì', N'ổ', 10000, 'banhmi.jpg'),
(1, N'Mì gói', N'gói', 5000, 'migoi.jpg'),
(2, N'Coca Cola', N'chai', 12000, 'coca.jpg'),
(2, N'Nước suối', N'chai', 8000, 'nuocsuoi.jpg'),
(3, N'Bàn chải đánh răng', N'cái', 15000, 'banchaidanhrang.jpg'),
(4, N'Bút bi', N'cây', 5000, 'butbi.jpg');

-- Thêm dữ liệu mẫu cho bảng Customer
INSERT INTO Customer (CustomerName, CustomerAddress, Phone, Point)
VALUES 
(N'Trần Thị B', N'Đà Nẵng', '0123123123', 100),
(N'Lê Văn C', N'Hải Phòng', '0456456456', 50),
(N'Phạm Hương D', N'Cần Thơ', '0789789789', 75);

-- Thêm dữ liệu mẫu cho bảng Bill
INSERT INTO Bill (AccountId, CreatedDate, CustomerId, TotalPrice)
VALUES 
(2, '2024-07-26', 1, 27000),
(3, '2024-07-26', 2, 20000),
(4, '2024-07-27', 3, 32000);

-- Thêm dữ liệu mẫu cho bảng BillDetail
INSERT INTO BillDetail (BillId, ProductId, Quantity, Subtotal)
VALUES 
(1, 1, 1, 10000),
(1, 3, 1, 12000),
(1, 6, 1, 5000),
(2, 2, 2, 10000),
(2, 4, 1, 8000),
(3, 3, 2, 24000),
(3, 5, 1, 15000);

-- Thêm dữ liệu mẫu cho bảng Timesheet
INSERT INTO Timesheet (AccountId, Worked, CheckIn, CheckOut)
VALUES 
(2, 1, '2024-07-26 08:00:00', '2024-07-26 17:00:00'),
(3, 1, '2024-07-26 08:30:00', '2024-07-26 17:30:00'),
(4, 1, '2024-07-27 08:15:00', '2024-07-27 17:15:00');
GO

CREATE PROCEDURE sp_LoadAllProducts
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        p.ProductId,
        p.TypeId,
        pt.TypeName,
        p.ProductName,
        p.Unit,
        p.Price,
        p.Images
    FROM 
        Product p
    INNER JOIN 
        ProductType pt ON p.TypeId = pt.TypeId
    ORDER BY 
        p.ProductId;
END

exec sp_LoadAllProducts