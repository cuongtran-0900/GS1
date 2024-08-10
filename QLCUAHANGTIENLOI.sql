-- Tạo cơ sở dữ liệu QLCUAHANGTIENLOI
CREATE DATABASE QLCUAHANGTIENLOI;
GO

-- Sử dụng cơ sở dữ liệu QLCUAHANGTIENLOI
--USE QLCUAHANGTIENLOI;
GO

-- Tạo bảng Account
CREATE TABLE Account (
    AccountId INT PRIMARY KEY IDENTITY(1,1),
    Username VARCHAR(50) NOT NULL,
    Pass VARCHAR(20) NOT NULL,
    Roles BIT NOT NULL,
    Fullname NVARCHAR(50) NOT NULL,
    UserAddress NVARCHAR(50) NOT NULL,
    Phone VARCHAR(15) NOT NULL,
    Email NVARCHAR(50) NOT NULL
);
GO

-- Tạo bảng ProductType với mã loại cập nhật
CREATE TABLE ProductType (
    TypeId NVARCHAR(10) PRIMARY KEY,
    TypeName NVARCHAR(15) NOT NULL
);
GO

-- Tạo bảng Product với các sản phẩm mới
CREATE TABLE Product (
    ProductId NVARCHAR(10) PRIMARY KEY,
    TypeId NVARCHAR(10) NOT NULL,
    ProductName NVARCHAR(50) NOT NULL,
    Unit NVARCHAR(10) NOT NULL,
    Price FLOAT NOT NULL,
    Images VARCHAR(255) NOT NULL
);
GO

-- Tạo bảng Customer
CREATE TABLE Customer (
    CustomerId NVARCHAR(10) PRIMARY KEY,
    CustomerName NVARCHAR(50) NOT NULL,
    CustomerAddress NVARCHAR(50) NOT NULL,
    Phone VARCHAR(15) NOT NULL,
    Point INT DEFAULT 0
);
GO

-- Tạo bảng Bill với khóa chính cập nhật
CREATE TABLE Bill (
    BillId NVARCHAR(10) PRIMARY KEY,
    AccountId INT NOT NULL,
    CreatedDate DATE NOT NULL,
    CustomerId NVARCHAR(10),
    TotalPrice FLOAT NOT NULL
);
GO

-- Tạo bảng BillDetail không có khóa chính
CREATE TABLE BillDetail (
    BillId NVARCHAR(10) NOT NULL,
    ProductId NVARCHAR(10),
    Quantity INT NOT NULL,
    Subtotal FLOAT NOT NULL,
	PRIMARY KEY(BillId, ProductId)
);
GO

-- Thêm ràng buộc khóa ngoại cho bảng Product liên kết với bảng ProductType
ALTER TABLE Product 
ADD CONSTRAINT FK_Product_ProductType 
FOREIGN KEY (TypeId) 
REFERENCES ProductType(TypeId);
GO

-- Thêm ràng buộc khóa ngoại cho bảng Bill liên kết với bảng Account
ALTER TABLE Bill 
ADD CONSTRAINT FK_Bill_Account 
FOREIGN KEY (AccountId) 
REFERENCES Account(AccountId);
GO

-- Thêm ràng buộc khóa ngoại cho bảng Bill liên kết với bảng Customer
ALTER TABLE Bill 
ADD CONSTRAINT FK_Bill_Customer 
FOREIGN KEY (CustomerId) 
REFERENCES Customer(CustomerId);
GO

-- Thêm ràng buộc khóa ngoại cho bảng BillDetail liên kết với bảng Bill
ALTER TABLE BillDetail 
ADD CONSTRAINT FK_BillDetail_Bill 
FOREIGN KEY (BillId) 
REFERENCES Bill(BillId);
GO

-- Thêm ràng buộc khóa ngoại cho bảng BillDetail liên kết với bảng Product
ALTER TABLE BillDetail 
ADD CONSTRAINT FK_BillDetail_Product 
FOREIGN KEY (ProductId) 
REFERENCES Product(ProductId);
GO

-- Thêm dữ liệu mẫu cho bảng Account
INSERT INTO Account (Username, Pass, Roles, Fullname, UserAddress, Phone, Email)
VALUES 
('lva', 'lva', 1, N'Lê Văn A', N'Hà Nội', '0123456789', 'lva@example.com'),
('nlthm', 'nlthm', 0, N'Nguyễn Lê Thị Hồng Minh', N'Hồ Chí Minh', '0987654321', 'nlthm@example.com'),
('ldk', 'ldk', 0, N'Lê Đức Khải', N'Đà Nẵng', '0369852147', 'ldk@example.com'),
('nvp', 'nvp', 0, N'Nguyễn Văn Phú', N'Hải Phòng', '0741852963', 'nvp@example.com');
GO

-- Thêm dữ liệu mẫu cho bảng ProductType với các mã cập nhật
INSERT INTO ProductType (TypeId, TypeName)
VALUES 
('TP', N'Thực phẩm'),
('DU', N'Đồ uống'),
('DGD', N'Đồ gia dụng'),
('VPP', N'Văn phòng phẩm');
GO

-- Thêm dữ liệu mẫu cho bảng Product với các sản phẩm mới và ảnh tương ứng
INSERT INTO Product (ProductId, TypeId, ProductName, Unit, Price, Images)
VALUES 
('TP001', 'TP', N'Bánh mì', N'ổ', 10000, 'banhmi.jpg'),
('TP002', 'TP', N'Mì gói', N'gói', 5000, 'migoi.jpg'),
('DU001', 'DU', N'Coca Cola', N'chai', 12000, 'coca.jpg'),
('DU002', 'DU', N'Nước suối', N'chai', 8000, 'nuocsuoi.jpg'),
('DGD001', 'DGD', N'Bàn chải đánh răng', N'cái', 15000, 'banchaidanhrang.jpg'),
('VPP001', 'VPP', N'Bút bi', N'cây', 5000, 'butbi.jpg'),
('TP003', 'TP', N'Bánh quy', N'hộp', 25000, 'banhquy.jpg'),
('TP004', 'TP', N'Snack khoai tây', N'gói', 12000, 'snackkhoaitay.jpg'),
('TP005', 'TP', N'Sữa tươi', N'hộp', 30000, 'suatuoi.jpg'),
('TP006', 'TP', N'Xúc xích', N'gói', 40000, 'xucxich.jpg'),
('TP007', 'TP', N'Cơm hộp', N'hộp', 35000, 'comhop.jpg'),
('DU003', 'DU', N'Trà xanh', N'chai', 15000, 'traxanh.jpg'),
('DU004', 'DU', N'Nước ép cam', N'chai', 20000, 'nuocepcam.jpg'),
('DU005', 'DU', N'Cà phê đóng hộp', N'lon', 18000, 'caphe.jpg'),
('DU006', 'DU', N'Sữa đậu nành', N'hộp', 12000, 'suadaunanh.jpg'),
('DU007', 'DU', N'Nước tăng lực', N'lon', 22000, 'nuoctangluc.jpg'),
('DGD002', 'DGD', N'Khăn giấy', N'gói', 15000, 'khangiay.jpg'),
('DGD003', 'DGD', N'Kem đánh răng', N'tuýp', 30000, 'kemdanhrang.jpg'),
('DGD004', 'DGD', N'Dầu gội', N'chai', 60000, 'daugoi.jpg'),
('DGD005', 'DGD', N'Xà phòng', N'bánh', 12000, 'xaphong.jpg'),
('DGD006', 'DGD', N'Nước rửa chén', N'chai', 35000, 'nuocruachen.jpg'),
('VPP002', 'VPP', N'Vở', N'quyển', 10000, 'vo.jpg'),
('VPP003', 'VPP', N'Bút chì', N'cây', 5000, 'butchi.jpg'),
('VPP004', 'VPP', N'Thước kẻ', N'cái', 8000, 'thuocke.jpg'),
('VPP005', 'VPP', N'Tẩy', N'cái', 4000, 'tay.jpg'),
('VPP006', 'VPP', N'Hộp bút', N'cái', 25000, 'hopbut.jpg'),
('TP008', 'TP', N'Bánh chưng', N'chiếc', 50000, 'banhchung.jpg'),
('TP009', 'TP', N'Bánh tét', N'chiếc', 60000, 'banhtet.jpg'),
('DU008', 'DU', N'Nước dừa', N'chai', 15000, 'nuocdua.jpg'),
('DU009', 'DU', N'Nước trái cây', N'chai', 20000, 'nuoctraicay.jpg'),
('DGD007', 'DGD', N'Đồ dùng học tập', N'bộ', 50000, 'dodunghoctap.jpg'),
('DGD008', 'DGD', N'Máy xay sinh tố', N'cái', 150000, 'mayxaysinh.jpg'),
('VPP007', 'VPP', N'Sổ tay', N'quyển', 15000, 'sotay.jpg'),
('VPP008', 'VPP', N'Tẩy xóa', N'cái', 5000, 'tayxoa.jpg'),
('TP010', 'TP', N'Bánh bao', N'chiếc', 20000, 'banhbao.jpg'),
('TP011', 'TP', N'Chả lụa', N'đôi', 25000, 'chalua.jpg'),
('DU010', 'DU', N'Sữa chua', N'hộp', 10000, 'suachua.jpg'),
('DU011', 'DU', N'Nước chanh', N'chai', 18000, 'nuocchanh.jpg'),
('DGD009', 'DGD', N'Ti vi', N'cái', 2000000, 'tivi.jpg'),
('DGD010', 'DGD', N'Quạt điện', N'cái', 500000, 'quatdien.jpg'),
('VPP009', 'VPP', N'Bìa còng', N'cái', 20000, 'biacong.jpg'),
('VPP010', 'VPP', N'Kéo cắt giấy', N'cái', 12000, 'keocatgiay.jpg'),
('TP012', 'TP', N'Chè đậu xanh', N'hộp', 20000, 'chedauxanh.jpg'),
('TP013', 'TP', N'Kem', N'cây', 15000, 'kem.jpg'),
('DU012', 'DU', N'Nước trái cây đóng hộp', N'lon', 25000, 'nuoctraicaylon.jpg'),
('DU013', 'DU', N'Cà phê hòa tan', N'gói', 30000, 'caphehoatan.jpg'),
('DGD011', 'DGD', N'Đèn pin', N'cái', 100000, 'denpin.jpg'),
('DGD012', 'DGD', N'Bình giữ nhiệt', N'cái', 70000, 'binhgiunhiet.jpg'),
('VPP011', 'VPP', N'Bảng trắng', N'cái', 250000, 'bangtrang.jpg'),
('VPP012', 'VPP', N'Phấn viết bảng', N'hộp', 15000, 'phanvietbang.jpg');
GO

-- Thêm dữ liệu mẫu cho bảng Customer
INSERT INTO Customer (CustomerId, CustomerName, CustomerAddress, Phone, Point)
VALUES 
('KH001', N'Trần Thị B', N'Đà Nẵng', '0123123123', 100),
('KH002', N'Lê Văn C', N'Hải Phòng', '0456456456', 50),
('KH003', N'Phạm Hương D', N'Cần Thơ', '0789789789', 75);
GO

-- Thêm dữ liệu mẫu cho bảng Bill với khóa chính mới
INSERT INTO Bill (BillId, AccountId, CreatedDate, CustomerId, TotalPrice)
VALUES 
('HD001', 2, '2024-07-26', 'KH001', 27000),
('HD002', 3, '2024-07-26', 'KH002', 20000),
('HD003', 4, '2024-07-27', 'KH003', 32000);
GO

-- Thêm dữ liệu mẫu cho bảng BillDetail không có khóa chính
INSERT INTO BillDetail (BillId, ProductId, Quantity, Subtotal)
VALUES 
('HD001', 'TP001', 1, 10000),
('HD001', 'DU001', 1, 12000),
('HD001', 'VPP001', 1, 5000),
('HD002', 'TP002', 2, 10000),
('HD002', 'DU002', 1, 8000),
('HD003', 'DU001', 2, 24000),
('HD003', 'DGD001', 1, 15000);
GO

-- Tạo thủ tục lưu trữ sp_LoadAllProducts
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
GO

-- Gọi thủ tục lưu trữ sp_LoadAllProducts
EXEC sp_LoadAllProducts;
GO

-- Tạo thủ tục lưu trữ sp_LoadAllAccounts
CREATE PROCEDURE sp_LoadAllAccounts
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        AccountId,
        Username,
        Pass,
        Roles,
        Fullname,
        UserAddress,
        Phone,
        Email
    FROM 
        Account
    ORDER BY 
        AccountId;
END
GO

-- Execute stored procedure to load all accounts
EXEC sp_LoadAllAccounts;
GO

-- Tạo thủ tục lưu trữ sp_LoadAllCustomers
CREATE PROCEDURE sp_LoadAllCustomers
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        CustomerId,
        CustomerName,
        CustomerAddress,
        Phone,
        Point
    FROM 
        Customer
    ORDER BY 
        CustomerId;
END
GO

-- Execute stored procedure to load all customers
EXEC sp_LoadAllCustomers;
GO

-- Tạo thủ tục lưu trữ sp_LoadAllBills
CREATE PROCEDURE sp_LoadAllBills
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        BillId,
        AccountId,
        CreatedDate,
        CustomerId,
        TotalPrice
    FROM 
        Bill
    ORDER BY 
        BillId;
END
GO

-- Execute stored procedure to load all bills
EXEC sp_LoadAllBills;
GO

-- Tạo thủ tục lưu trữ sp_LoadAllBillDetails
CREATE PROCEDURE sp_LoadAllBillDetails
AS
BEGIN
    SET NOCOUNT ON;

    SELECT 
        BillId,
        ProductId,
        Quantity,
        Subtotal
    FROM 
        BillDetail
    ORDER BY 
        BillId, ProductId;
END
GO

-- Execute stored procedure to load all bill details
EXEC sp_LoadAllBillDetails;
GO

-- Tạo thủ tục lưu trữ sp_LoadAllProductTypes
CREATE PROCEDURE sp_LoadAllProductTypes
AS
BEGIN
    SET NOCOUNT ON;

    SELECT TypeId, TypeName
    FROM ProductType;
END;
GO

-- Execute stored procedure to load all product types
EXEC sp_LoadAllProductTypes;
GO