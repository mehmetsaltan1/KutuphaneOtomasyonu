-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 13 Haz 2020, 20:50:06
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `kutuphane`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `girisbilgi`
--

CREATE TABLE `girisbilgi` (
  `user` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `pass` text COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `girisbilgi`
--

INSERT INTO `girisbilgi` (`user`, `pass`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kitaplar`
--

CREATE TABLE `kitaplar` (
  `id` int(11) NOT NULL,
  `kitapismi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `yazari` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `turu` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `sayfasayisi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `yayinevi` text COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kitaplar`
--

INSERT INTO `kitaplar` (`id`, `kitapismi`, `yazari`, `turu`, `sayfasayisi`, `yayinevi`) VALUES
(22, 'deneme', 'abcd', 'aada', '212', 'aass'),
(23, 'denemesd', 'abcd', 'aada', '212', 'aass'),
(24, 'denemesd', 'abcd', 'aadadsas', '212', 'aass'),
(28, 'denemesd', 'abcd', 'aadadsas', '212', 'aass');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kitaplar`
--
ALTER TABLE `kitaplar`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kitaplar`
--
ALTER TABLE `kitaplar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
