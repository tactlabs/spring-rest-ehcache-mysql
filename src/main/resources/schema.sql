
CREATE TABLE IF NOT EXISTS `tip` (
  `tip_id` int(11) NOT NULL auto_increment,
  `tips` varchar(255) NOT NULL,
  `added_by` varchar(255),
  PRIMARY KEY  (`tip_id`)
) ;
