-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 21, 2021 lúc 04:23 PM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `dbtiempho`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `banlon`
--

CREATE TABLE `banlon` (
  `maBan` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tinhTrang` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `banlon`
--

INSERT INTO `banlon` (`maBan`, `tinhTrang`) VALUES
('BL1', 0),
('BL10', 0),
('BL11', 0),
('BL12', 0),
('BL13', 0),
('BL14', 0),
('BL15', 0),
('BL16', 0),
('BL17', 0),
('BL18', 0),
('BL19', 0),
('BL2', 0),
('BL20', 0),
('BL3', 0),
('BL4', 0),
('BL5', 0),
('BL6', 0),
('BL7', 0),
('BL8', 0),
('BL9', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bannho`
--

CREATE TABLE `bannho` (
  `maBan` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tinhTrang` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `bannho`
--

INSERT INTO `bannho` (`maBan`, `tinhTrang`) VALUES
('BN1', 0),
('BN10', 0),
('BN11', 0),
('BN12', 0),
('BN13', 0),
('BN14', 0),
('BN15', 0),
('BN16', 0),
('BN17', 0),
('BN18', 0),
('BN19', 0),
('BN2', 0),
('BN20', 0),
('BN21', 0),
('BN22', 0),
('BN23', 0),
('BN24', 0),
('BN25', 0),
('BN26', 0),
('BN27', 0),
('BN28', 0),
('BN29', 0),
('BN3', 0),
('BN30', 0),
('BN4', 0),
('BN5', 0),
('BN6', 0),
('BN7', 0),
('BN8', 0),
('BN9', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietgiohang`
--

CREATE TABLE `chitietgiohang` (
  `maCTGH` int(11) NOT NULL,
  `maGioHang` int(11) NOT NULL,
  `maLoaiMon` int(1) NOT NULL,
  `tenMon` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `soLuong` int(2) NOT NULL,
  `donGia` int(11) NOT NULL,
  `thanhTien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietgiohang`
--

INSERT INTO `chitietgiohang` (`maCTGH`, `maGioHang`, `maLoaiMon`, `tenMon`, `soLuong`, `donGia`, `thanhTien`) VALUES
(4, 5, 1, 'Phở Tô nhỏ - Bò viên', 1, 45000, 45000),
(8, 23, 1, 'phở mì', 1, 30000, 30000),
(9, 5, 1, 'Phở Tô lớn - Gân - Tái - Nạm', 1, 60000, 60000),
(10, 5, 1, 'Phở Tô nhỏ - Nạm', 1, 45000, 45000),
(11, 23, 1, 'Phở Tô đặc biệt - Bò viên - Gân - Tái - Nạm', 2, 75000, 150000),
(12, 23, 1, 'Phở Tô đặc biệt - Tái', 1, 75000, 75000),
(13, 36, 1, 'Phở Tô lớn - Tái', 4, 60000, 240000),
(14, 32, 1, 'Phở Tô lớn - Bò viên - Nạm', 1, 60000, 60000),
(15, 32, 1, 'Phở Tô nhỏ - Bò viên - Nạm', 3, 45000, 135000),
(19, 23, 1, 'Phở Tô đặc biệt - Nạm', 1, 75000, 75000),
(20, 38, 1, 'Phở Tô lớn - Nạm', 3, 60000, 180000),
(22, 43, 1, 'Phở Tô lớn - Nạm', 1, 60000, 60000),
(23, 44, 1, 'Phở Tô lớn - Bò viên - Tái', 1, 60000, 60000),
(24, 45, 1, 'Phở Tô đặc biệt - Gân - Nạm', 1, 75000, 75000),
(25, 46, 1, 'Phở Tô lớn - Gân', 1, 60000, 60000),
(26, 47, 1, 'Phở Tô đặc biệt - Bò viên', 1, 75000, 75000),
(27, 48, 1, 'Phở Tô lớn - Bò viên', 1, 60000, 60000),
(28, 49, 1, 'Phở Tô lớn - Gầu - Bò viên', 1, 60000, 60000),
(29, 50, 1, 'Phở Tô đặc biệt - Gầu - Bò viên - Tái - Nạm', 1, 75000, 75000),
(30, 51, 1, 'Phở Tô lớn - Gân - Tái - Nạm', 1, 60000, 60000),
(31, 52, 1, 'Phở Tô lớn - Nạm', 1, 60000, 60000),
(33, 52, 2, 'Bánh phở thêm', 1, 10000, 10000),
(34, 32, 2, 'Hột gà', 1, 5000, 5000),
(35, 54, 1, 'Phở Tô lớn - Bò viên', 1, 60000, 60000),
(36, 54, 2, 'Thịt thêm', 1, 25000, 25000),
(37, 55, 1, 'Phở Tô nhỏ - Tái', 1, 45000, 45000),
(38, 56, 1, 'Phở Tô đặc biệt - Nạm', 1, 75000, 75000),
(39, 56, 2, 'Tiết', 2, 10000, 20000),
(41, 57, 1, 'Phở Tô đặc biệt - Bò viên', 1, 75000, 75000),
(42, 58, 1, 'Phở Tô lớn - Tái', 1, 60000, 60000),
(43, 59, 1, 'Phở Tô lớn - Nạm', 1, 60000, 60000),
(44, 59, 2, 'Thịt thêm', 1, 25000, 25000),
(45, 60, 1, 'Phở Tô lớn - Nạm', 1, 60000, 60000),
(46, 60, 2, 'Quẩy', 1, 5000, 5000),
(47, 61, 1, 'Phở Tô lớn - Tái', 1, 60000, 60000),
(48, 62, 1, 'Phở Tô nhỏ - Nạm', 1, 45000, 45000),
(49, 63, 1, 'Phở Tô đặc biệt - Tái', 1, 75000, 75000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `maChucVu` int(11) NOT NULL,
  `tenChucvu` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`maChucVu`, `tenChucvu`) VALUES
(0, 'admin'),
(1, 'Nhân viên quầy'),
(3, 'Nhân viên phục vụ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giohang`
--

CREATE TABLE `giohang` (
  `maGioHang` int(11) NOT NULL,
  `maBan` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tongTien` int(11) DEFAULT NULL,
  `tinhTrang` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `giohang`
--

INSERT INTO `giohang` (`maGioHang`, `maBan`, `tongTien`, `tinhTrang`) VALUES
(5, 'BN1', NULL, 0),
(23, 'BN5', NULL, 0),
(32, 'BL1', NULL, 0),
(36, 'BN2', NULL, 0),
(38, 'BN8', NULL, 0),
(43, 'BN8', NULL, 0),
(44, 'BN8', NULL, 0),
(45, 'BN5', NULL, 0),
(46, 'BN20', NULL, 0),
(47, 'BN21', NULL, 0),
(48, 'BN18', NULL, 0),
(49, 'BN1', NULL, 0),
(50, 'BN5', NULL, 0),
(51, 'BN6', NULL, 0),
(52, 'BN1', NULL, 0),
(54, 'BL8', NULL, 0),
(55, 'BN2', NULL, 0),
(56, 'BL1', NULL, 0),
(57, 'BN4', NULL, 0),
(58, 'BN30', NULL, 0),
(59, 'BN1', NULL, 0),
(60, 'BN16', NULL, 0),
(61, 'BN8', NULL, 0),
(62, 'BN5', NULL, 1),
(63, 'BN1', NULL, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `maHoaDon` int(11) NOT NULL,
  `maGioHang` int(11) NOT NULL,
  `maBan` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ngayLap` datetime DEFAULT NULL,
  `maNVNhanYeuCau` int(11) NOT NULL,
  `maNVThanhToan` int(11) NOT NULL,
  `maNVQuay` int(11) DEFAULT NULL,
  `tongTien` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`maHoaDon`, `maGioHang`, `maBan`, `ngayLap`, `maNVNhanYeuCau`, `maNVThanhToan`, `maNVQuay`, `tongTien`) VALUES
(17, 5, 'BN1', '2021-05-15 19:20:31', 3, 8, 0, 150000),
(18, 36, 'BN2', '2021-05-15 19:33:13', 8, 3, 0, 240000),
(19, 38, 'BN8', '2021-05-15 20:24:34', 3, 8, 0, 180000),
(20, 23, 'BN5', '2021-05-16 15:25:23', 3, 8, 0, 330000),
(21, 43, 'BN8', '2021-05-16 15:29:20', 8, 3, 0, 60000),
(22, 44, 'BN8', '2021-05-16 15:43:00', 8, 8, 0, 60000),
(23, 45, 'BN5', '2021-05-16 15:45:45', 3, 3, 0, 75000),
(24, 46, 'BN20', '2021-05-16 15:59:56', 3, 8, 0, 60000),
(25, 47, 'BN21', '2021-05-16 16:11:48', 3, 8, 0, 75000),
(26, 48, 'BN18', '2021-05-16 16:14:09', 3, 8, 0, 60000),
(27, 50, 'BN5', '2021-05-16 16:17:02', 3, 8, 0, 75000),
(28, 49, 'BN1', '2021-05-16 16:19:24', 8, 3, 0, 60000),
(29, 51, 'BN6', '2021-05-16 18:17:47', 3, 8, 0, 60000),
(30, 32, 'BL1', '2021-05-17 09:48:04', 3, 8, 0, 100000),
(31, 54, 'BL8', '2021-05-17 09:54:24', 8, 3, 0, 85000),
(32, 55, 'BN2', '2021-05-17 10:11:49', 8, 3, 0, 45000),
(33, 52, 'BN1', '2021-05-18 19:29:30', 3, 8, 0, 70000),
(34, 56, 'BL1', '2021-05-18 19:31:53', 8, 3, 0, 95000),
(35, 57, 'BN4', '2021-05-18 19:38:31', 3, 8, 0, 75000),
(36, 58, 'BN30', '2021-05-18 19:40:21', 8, 8, 0, 60000),
(37, 58, 'BN30', '2021-05-18 19:40:21', 3, 8, 0, 60000),
(38, 60, 'BN16', '2021-05-19 10:30:00', 3, 8, 0, 65000),
(39, 59, 'BN1', '2021-05-19 10:06:41', 3, 8, 0, 85000),
(40, 61, 'BN8', '2021-05-19 10:12:06', 3, 8, 0, 60000),
(42, 60, 'BN16', '2021-05-19 10:30:00', 8, 3, 0, 65000),
(43, 60, 'BN16', '2021-05-19 10:30:00', 3, 8, 0, 65000),
(44, 60, 'BN16', '2021-05-19 10:30:00', 3, 8, 0, 65000),
(45, 63, 'BN1', '2021-05-21 07:54:51', 3, 8, 0, 75000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaiban`
--

CREATE TABLE `loaiban` (
  `maLoaiBan` int(11) NOT NULL,
  `tenBan` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `soLuong` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaiban`
--

INSERT INTO `loaiban` (`maLoaiBan`, `tenBan`, `soLuong`) VALUES
(1, 'bàn nhỏ', 30),
(2, 'bàn lớn', 20);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaimonan`
--

CREATE TABLE `loaimonan` (
  `maLoai` int(1) NOT NULL,
  `tenLoai` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaimonan`
--

INSERT INTO `loaimonan` (`maLoai`, `tenLoai`) VALUES
(1, 'Phở'),
(2, 'Topping');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaithit`
--

CREATE TABLE `loaithit` (
  `maLoaiThit` int(11) NOT NULL,
  `tenThit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaito`
--

CREATE TABLE `loaito` (
  `maLoaiTo` int(11) NOT NULL,
  `tenLoaito` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `gia` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaito`
--

INSERT INTO `loaito` (`maLoaiTo`, `tenLoaito`, `gia`) VALUES
(1, 'Tô nhỏ', 45000),
(2, 'Tô lớn', 60000),
(3, 'Tô đặc biệt', 75000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaitopping`
--

CREATE TABLE `loaitopping` (
  `maloai` int(11) NOT NULL,
  `tenTopping` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `gia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaitopping`
--

INSERT INTO `loaitopping` (`maloai`, `tenTopping`, `gia`) VALUES
(1, 'Quẩy', 5000),
(2, 'Hột gà', 5000),
(3, 'Bánh phở thêm', 10000),
(4, 'Tiết', 10000),
(5, 'Tiết hột gà', 15000),
(6, 'Thịt thêm', 25000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNhanVien` int(11) NOT NULL,
  `tenNhanVien` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `sdtNhanVien` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `diaChi` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `maChucVu` int(11) NOT NULL,
  `gioiTinh` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`maNhanVien`, `tenNhanVien`, `sdtNhanVien`, `diaChi`, `maChucVu`, `gioiTinh`) VALUES
(0, 'admin', '', '', 0, ''),
(1, 'Nguyễn Văn Linh', '0353369654', 'Đồng Nai', 1, 'Nam'),
(3, 'Lê Thị Liên', '0124785324', 'Bình Dương', 3, 'Nữ'),
(8, 'Đào Duy Lợi', '0125478963', 'Quận 5,TP Hồ Chí Minh', 3, 'Nam'),
(20, 'Hoàng Phương Anh', '0532145689', 'Bình Thạnh , tp Hồ Chí Minh', 1, 'Nữ'),
(21, 'Phạm Thu Thuỷ', '0125487963', 'Bình Chánh', 1, 'Nữ'),
(23, 'ffs', '0123545', 'sdgs', 1, 'Nam');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quyen`
--

CREATE TABLE `quyen` (
  `maQuyen` int(11) NOT NULL,
  `tenQuyen` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `quyen`
--

INSERT INTO `quyen` (`maQuyen`, `tenQuyen`) VALUES
(0, 'admin'),
(1, 'quản lý');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `maTaiKhoan` int(11) NOT NULL,
  `tenDangNhap` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `matKhau` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `quyen` int(11) NOT NULL,
  `trangThai` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`maTaiKhoan`, `tenDangNhap`, `matKhau`, `quyen`, `trangThai`) VALUES
(0, 'admin', 'admin', 0, 1),
(1, 'nv2', '1234', 1, 1),
(21, 'nv1', 'thuthuy', 1, 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `banlon`
--
ALTER TABLE `banlon`
  ADD PRIMARY KEY (`maBan`);

--
-- Chỉ mục cho bảng `bannho`
--
ALTER TABLE `bannho`
  ADD PRIMARY KEY (`maBan`);

--
-- Chỉ mục cho bảng `chitietgiohang`
--
ALTER TABLE `chitietgiohang`
  ADD PRIMARY KEY (`maCTGH`),
  ADD KEY `maGioHang` (`maGioHang`),
  ADD KEY `maLoaiMon` (`maLoaiMon`);

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`maChucVu`);

--
-- Chỉ mục cho bảng `giohang`
--
ALTER TABLE `giohang`
  ADD PRIMARY KEY (`maGioHang`),
  ADD KEY `maBan` (`maBan`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`maHoaDon`),
  ADD KEY `maNVQuay` (`maNVQuay`),
  ADD KEY `maNVNhanYeuCau` (`maNVNhanYeuCau`),
  ADD KEY `maNVThanhToan` (`maNVThanhToan`),
  ADD KEY `maBan` (`maBan`),
  ADD KEY `maGioHang` (`maGioHang`);

--
-- Chỉ mục cho bảng `loaiban`
--
ALTER TABLE `loaiban`
  ADD PRIMARY KEY (`maLoaiBan`);

--
-- Chỉ mục cho bảng `loaimonan`
--
ALTER TABLE `loaimonan`
  ADD PRIMARY KEY (`maLoai`);

--
-- Chỉ mục cho bảng `loaithit`
--
ALTER TABLE `loaithit`
  ADD PRIMARY KEY (`maLoaiThit`);

--
-- Chỉ mục cho bảng `loaito`
--
ALTER TABLE `loaito`
  ADD PRIMARY KEY (`maLoaiTo`);

--
-- Chỉ mục cho bảng `loaitopping`
--
ALTER TABLE `loaitopping`
  ADD PRIMARY KEY (`maloai`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNhanVien`),
  ADD KEY `maChucVu` (`maChucVu`);

--
-- Chỉ mục cho bảng `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`maQuyen`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`maTaiKhoan`),
  ADD KEY `quyen` (`quyen`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chitietgiohang`
--
ALTER TABLE `chitietgiohang`
  MODIFY `maCTGH` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  MODIFY `maChucVu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `giohang`
--
ALTER TABLE `giohang`
  MODIFY `maGioHang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `maHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT cho bảng `loaiban`
--
ALTER TABLE `loaiban`
  MODIFY `maLoaiBan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `loaithit`
--
ALTER TABLE `loaithit`
  MODIFY `maLoaiThit` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `loaito`
--
ALTER TABLE `loaito`
  MODIFY `maLoaiTo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `loaitopping`
--
ALTER TABLE `loaitopping`
  MODIFY `maloai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `maNhanVien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT cho bảng `quyen`
--
ALTER TABLE `quyen`
  MODIFY `maQuyen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitietgiohang`
--
ALTER TABLE `chitietgiohang`
  ADD CONSTRAINT `chitietgiohang_ibfk_1` FOREIGN KEY (`maGioHang`) REFERENCES `giohang` (`maGioHang`),
  ADD CONSTRAINT `chitietgiohang_ibfk_2` FOREIGN KEY (`maLoaiMon`) REFERENCES `loaimonan` (`maLoai`);

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`maNVQuay`) REFERENCES `nhanvien` (`maNhanVien`),
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`maNVNhanYeuCau`) REFERENCES `nhanvien` (`maNhanVien`),
  ADD CONSTRAINT `hoadon_ibfk_3` FOREIGN KEY (`maNVThanhToan`) REFERENCES `nhanvien` (`maNhanVien`),
  ADD CONSTRAINT `hoadon_ibfk_4` FOREIGN KEY (`maGioHang`) REFERENCES `giohang` (`maGioHang`);

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`maChucVu`) REFERENCES `chucvu` (`maChucVu`);

--
-- Các ràng buộc cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`maTaiKhoan`) REFERENCES `nhanvien` (`maNhanVien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `taikhoan_ibfk_2` FOREIGN KEY (`quyen`) REFERENCES `quyen` (`maQuyen`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
