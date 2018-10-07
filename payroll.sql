-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 07, 2018 at 09:59 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `payroll`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `emp_id` int(11) NOT NULL,
  `time_from` time NOT NULL,
  `time_to` time NOT NULL,
  `hrs` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `date`, `emp_id`, `time_from`, `time_to`, `hrs`) VALUES
(1, '2018-10-07', 1, '21:21:00', '22:21:00', 0);

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE `departments` (
  `id` int(11) NOT NULL,
  `Dep_Name` varchar(300) NOT NULL,
  `Dep_Description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departments`
--

INSERT INTO `departments` (`id`, `Dep_Name`, `Dep_Description`) VALUES
(3, 'IT', 'geeks'),
(4, 'Staff', 'hey');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(11) NOT NULL,
  `surname` varchar(100) NOT NULL,
  `other_names` varchar(150) NOT NULL,
  `gender` enum('Male','Female','','') NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(200) NOT NULL,
  `email` varchar(300) NOT NULL,
  `phone` int(11) NOT NULL,
  `img` mediumblob,
  `joindate` date NOT NULL,
  `department` varchar(100) NOT NULL,
  `designation` varchar(100) NOT NULL,
  `payment` varchar(200) NOT NULL,
  `other` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `surname`, `other_names`, `gender`, `dob`, `address`, `email`, `phone`, `img`, `joindate`, `department`, `designation`, `payment`, `other`) VALUES
(1, 'bady', 'okita', 'Male', '1998-08-12', 'Langata', 'badyat', 423434, NULL, '1998-08-12', 'IT', 'Programmer59', 'Cheque', 'acc num 123'),
(3, 'bsd', '', 'Male', '2018-08-10', '', '', 3213, NULL, '2018-08-21', 'IT', 'Programmer 3', 'Cheque', '');

-- --------------------------------------------------------

--
-- Table structure for table `holiday`
--

CREATE TABLE `holiday` (
  `id` int(11) NOT NULL,
  `Holiday` varchar(255) NOT NULL,
  `overtime` varchar(255) NOT NULL,
  `rate` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `holiday`
--

INSERT INTO `holiday` (`id`, `Holiday`, `overtime`, `rate`) VALUES
(1, 'Madaraka day', 'Cash', 5000),
(2, 'Christmas', 'None', 0),
(3, 'Mashujaa Day', 'Percentage', 5),
(4, 'Boxing Day', 'None', 0);

-- --------------------------------------------------------

--
-- Table structure for table `holiday_overtime`
--

CREATE TABLE `holiday_overtime` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `holiday` varchar(255) NOT NULL,
  `emp_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `holiday_overtime`
--

INSERT INTO `holiday_overtime` (`id`, `date`, `holiday`, `emp_id`) VALUES
(1, '2018-10-07', 'Madaraka day', 1);

-- --------------------------------------------------------

--
-- Table structure for table `leave_management`
--

CREATE TABLE `leave_management` (
  `id` int(11) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `date_from` date NOT NULL,
  `date_to` date NOT NULL,
  `payable` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `leave_management`
--

INSERT INTO `leave_management` (`id`, `emp_id`, `date_from`, `date_to`, `payable`) VALUES
(1, 1, '2018-10-07', '2018-10-08', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `overtime`
--

CREATE TABLE `overtime` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `emp_id` int(11) NOT NULL,
  `time_from` time NOT NULL,
  `time_to` time NOT NULL,
  `hrs` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `overtime`
--

INSERT INTO `overtime` (`id`, `date`, `emp_id`, `time_from`, `time_to`, `hrs`) VALUES
(1, '2018-10-07', 1, '21:28:00', '22:28:00', 0);

-- --------------------------------------------------------

--
-- Table structure for table `sub_departments`
--

CREATE TABLE `sub_departments` (
  `id` int(11) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Designation` varchar(200) NOT NULL,
  `OverStatus` tinyint(1) DEFAULT NULL,
  `OverRate` varchar(100) DEFAULT NULL,
  `OverAmount` int(11) DEFAULT NULL,
  `BasicPay` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sub_departments`
--

INSERT INTO `sub_departments` (`id`, `Department`, `Designation`, `OverStatus`, `OverRate`, `OverAmount`, `BasicPay`) VALUES
(2, 'IT', 'Programmer 2', 1, 'CASH', 5000, 50000),
(3, 'IT', 'Programmer 3', 1, 'PERCENTAGE', 5, 50000),
(4, 'IT', 'Programmer59', 0, 'NULL', 0, 50000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `type`) VALUES
(1, 'admin', '1234', 'Administrator');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `holiday`
--
ALTER TABLE `holiday`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `holiday_overtime`
--
ALTER TABLE `holiday_overtime`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `leave_management`
--
ALTER TABLE `leave_management`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `overtime`
--
ALTER TABLE `overtime`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `holiday`
--
ALTER TABLE `holiday`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `holiday_overtime`
--
ALTER TABLE `holiday_overtime`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `leave_management`
--
ALTER TABLE `leave_management`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `overtime`
--
ALTER TABLE `overtime`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
