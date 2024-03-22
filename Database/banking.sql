-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2022 at 07:44 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banking`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `account_number` bigint(20) NOT NULL,
  `balance` bigint(20) NOT NULL,
  `account_type` varchar(30) NOT NULL,
  `opening_date` varchar(20) NOT NULL,
  `debit_card_no` bigint(20) NOT NULL,
  `pin` int(11) NOT NULL,
  `check_book` int(11) NOT NULL DEFAULT 0,
  `customer_id` int(11) NOT NULL,
  `branch_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

CREATE TABLE `branch` (
  `branch_id` int(11) NOT NULL,
  `branch_name` varchar(50) NOT NULL,
  `branch_ifsc` varchar(20) NOT NULL,
  `branch_address` varchar(100) NOT NULL,
  `branch_number` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`branch_id`, `branch_name`, `branch_ifsc`, `branch_address`, `branch_number`) VALUES
(1, 'Anand Vihar', 'SBIN0005195', 'C-61, Anand Vihar, Delhi 110042', 22145050),
(2, 'Azadpur', 'SBIN0001707', 'D 1, Pachvati Azadpur Delhi Pin 110033', 27672381),
(3, 'Chandni Chwk', 'SBIN0000631', 'Chandni Chowk, Delhi 110006', 1800112211),
(4, 'Dwarka Court Complex', 'SBIN0011566', 'Dwarka Court Complex Sector 10', 250719991),
(5, 'Ashok Vihar', 'PUNB0158120', '2, Commercial Shopping, Centre No II', 18001802222),
(6, 'Burari Village', 'PINB0105100', '303, 1, Burari Vpo Burari (Semi Urban)', 27612729),
(7, 'Chawri Bazar', 'PUNB0011400', 'Chawri Bazar, Raghu Ganj, Delhi', 23915974),
(8, 'Civil Lines', 'PUNB0011500', '13-alipur Road, Civil Lines, Delhi', 23981957),
(9, 'Badli New Delhi', 'BARB0TRDBAD', 'vil, P.O - Badli, Delhi - 110042', 1800223344),
(10, 'Bawana Delhi', 'BARB0BAWANA', '48 Narela Road, 1st Floor, Bawana, Delhi-110039', 18001024455),
(11, 'Daryaganj Delhi', 'BARB0DBDARY', '3631 Netaji Subash Marg Delhi 110002', 18002584455),
(12, 'Dilshad Garden', 'BARB0VJDIGA', 'C19, Mrignaini Chowk, Delhi 110095', 18002584455),
(13, 'Tagore Garden Delhi', 'CNRB0000391', 'E21 Tagor Garden New Delhi 110027', 18004250018),
(14, 'Vasanth Vihar Delhi', 'CNRB0002746', 'C C Centre, Vasanth Vihar, Delhi ', 18001030018),
(15, 'Shaktinagar Delhi', 'CNRB0001170', 'Nangia Park, Shaktinagar, Delhi 110007', 180030113333),
(16, 'Rohini Sector 3', 'CNRB0003008', 'Deepali Chowk, Rohini Sector 3, Delhi 110085', 18001030018),
(17, 'Badarpur Delhi', 'UTIB0004799', 'Khasra No 36, Badarpur, New Delhi', 18605005555),
(18, 'Chawri Bazar', 'UTIB0001548', 'First Floor, Property 3978-80, Chawri Bazar', 18004195577),
(19, 'Gandhi Nagar', 'UTIB0002565', 'Municipal No 329 A, Gandhi Nagar', 18604195555),
(20, 'Inderpuri', 'UTIB0003755', 'R 15, Inderpuri 110012', 18005005555);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `mobile_number` bigint(20) NOT NULL,
  `aadhar_number` bigint(20) NOT NULL,
  `pan_number` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transaction_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `mode` varchar(50) NOT NULL,
  `amount` bigint(11) NOT NULL,
  `date` varchar(20) NOT NULL,
  `to_id` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`account_number`);

--
-- Indexes for table `branch`
--
ALTER TABLE `branch`
  ADD PRIMARY KEY (`branch_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transaction_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `branch`
--
ALTER TABLE `branch`
  MODIFY `branch_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `transaction_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



ALTER TABLE `report`
  MODIFY `r_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;


  CREATE TABLE `report` (

  `email` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
 `date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
