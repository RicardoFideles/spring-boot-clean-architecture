CREATE TABLE IF NOT EXISTS `todos` (
  id bigint AUTO_INCREMENT primary key,
  name varchar(255) not null,
  description varchar(255) not null,
  status varchar(255) not null,
  priority int not null
);