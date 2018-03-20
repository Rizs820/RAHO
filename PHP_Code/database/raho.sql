-- phpMyAdmin SQL Dump
-- version 4.4.15.8
-- https://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 21, 2018 at 01:22 AM
-- Server version: 5.6.31
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `raho`
--

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--

CREATE TABLE IF NOT EXISTS `cities` (
  `id` int(11) NOT NULL,
  `city_name` varchar(100) NOT NULL,
  `description` text NOT NULL,
  `lat` float NOT NULL,
  `lng` float NOT NULL,
  `image` varchar(500) DEFAULT NULL,
  `number_of_trips` int(11) NOT NULL DEFAULT '0'
) ENGINE=MyISAM AUTO_INCREMENT=39 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--

INSERT INTO `cities` (`id`, `city_name`, `description`, `lat`, `lng`, `image`, `number_of_trips`) VALUES
(35, 'Ajmer', 'Ajmer is a city in the northern Indian state of Rajasthan. South of the city artificial Ana Sagar Lake is Ajmer Sharif Dargah, the domed shrine of the Muslim Sufi saint Garib Nawaz. Nearby, a 16th-century palace built by the Mughal emperor Akbar now houses the Ajmer Government Museum, displaying armor and stone sculptures. A museum at the Indo-Saracenic-style Mayo College exhibits art and taxidermied birds.\r\n', 26.4499, 74.6399, NULL, 3),
(38, 'Jaipur', 'Jaipur is the capital of India''s Rajasthan state. It evokes the royal family that once ruled the region and that, in 1727, founded what is now called the Old City, or Pink City for its trademark building color. At the center of its stately street grid (notable in India) stands the opulent, colonnaded City Palace complex. With gardens, courtyards and museums, part of it is still a royal residence.', 26.9078, 75.781, NULL, 5),
(37, 'Udaipur', 'Udaipur, formerly the capital of the Mewar Kingdom, is a city in the western Indian state of Rajasthan. Founded by Maharana Udai Singh II in 1559, it’s set around a series of artificial lakes and is known for its lavish royal residences. City Palace, overlooking Lake Pichola, is a monumental complex of 11 palaces, courtyards and gardens, famed for its intricate peacock mosaics.', 24.5854, 73.7125, NULL, 3);

-- --------------------------------------------------------

--
-- Table structure for table `city_facts`
--

CREATE TABLE IF NOT EXISTS `city_facts` (
  `id` int(11) NOT NULL,
  `city_id` int(11) NOT NULL,
  `fact` text NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=73 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `city_images`
--

CREATE TABLE IF NOT EXISTS `city_images` (
  `id` int(11) NOT NULL,
  `city_id` int(11) NOT NULL,
  `image_url` text NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `monuments`
--

CREATE TABLE IF NOT EXISTS `monuments` (
  `monument_id` int(11) NOT NULL,
  `monument_name` varchar(200) NOT NULL,
  `monument_description` text,
  `monument_image` varchar(500) NOT NULL,
  `city_id` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `monuments_estimote`
--

CREATE TABLE IF NOT EXISTS `monuments_estimote` (
  `id` int(11) NOT NULL,
  `UID` varchar(40) NOT NULL,
  `major` int(10) NOT NULL,
  `minor` int(10) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `trips`
--

CREATE TABLE IF NOT EXISTS `trips` (
  `trip_id` int(11) NOT NULL,
  `city_id` int(11) NOT NULL,
  `title` varchar(200) DEFAULT NULL,
  `start_time` int(11) NOT NULL,
  `end_time` int(11) DEFAULT NULL
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trips`
--

INSERT INTO `trips` (`trip_id`, `city_id`, `title`, `start_time`, `end_time`) VALUES
(30, 2, 'Hackathon', 1521484200, NULL),
(31, 37, 'Hackathon', 1521484200, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `trip_images`
--

CREATE TABLE IF NOT EXISTS `trip_images` (
  `trip_image_id` int(11) NOT NULL,
  `trip_id` int(11) NOT NULL,
  `image_url` varchar(500) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `trip_users`
--

CREATE TABLE IF NOT EXISTS `trip_users` (
  `trip_user_id` int(11) NOT NULL,
  `trip_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trip_users`
--

INSERT INTO `trip_users` (`trip_user_id`, `trip_id`, `user_id`) VALUES
(31, 30, 14),
(32, 31, 16);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL,
  `name` varchar(500) DEFAULT NULL,
  `contact` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `contact`, `password`) VALUES
(9, 'SDC Founder', '9876543210', '202cb962ac59075b964b07152d234b70'),
(11, 'akshay ghodake', '7030158668', 'e99a18c428cb38d5f260853678922e03'),
(14, 'Harish Rahangdale', '8237061139', 'e19d5cd5af0378da05f63f891c7467af'),
(15, 'sdc', '12345', '827ccb0eea8a706c4c34a16891f84e7b'),
(16, 'sdc', '1234567890', '25d55ad283aa400af464c76d713c07ad');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cities`
--
ALTER TABLE `cities`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `city_facts`
--
ALTER TABLE `city_facts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `city_images`
--
ALTER TABLE `city_images`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `monuments`
--
ALTER TABLE `monuments`
  ADD PRIMARY KEY (`monument_id`);

--
-- Indexes for table `monuments_estimote`
--
ALTER TABLE `monuments_estimote`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `trips`
--
ALTER TABLE `trips`
  ADD PRIMARY KEY (`trip_id`);

--
-- Indexes for table `trip_images`
--
ALTER TABLE `trip_images`
  ADD PRIMARY KEY (`trip_image_id`);

--
-- Indexes for table `trip_users`
--
ALTER TABLE `trip_users`
  ADD PRIMARY KEY (`trip_user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `contact` (`contact`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cities`
--
ALTER TABLE `cities`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=39;
--
-- AUTO_INCREMENT for table `city_facts`
--
ALTER TABLE `city_facts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=73;
--
-- AUTO_INCREMENT for table `city_images`
--
ALTER TABLE `city_images`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=37;
--
-- AUTO_INCREMENT for table `monuments`
--
ALTER TABLE `monuments`
  MODIFY `monument_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `monuments_estimote`
--
ALTER TABLE `monuments_estimote`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `trips`
--
ALTER TABLE `trips`
  MODIFY `trip_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=32;
--
-- AUTO_INCREMENT for table `trip_images`
--
ALTER TABLE `trip_images`
  MODIFY `trip_image_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `trip_users`
--
ALTER TABLE `trip_users`
  MODIFY `trip_user_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
