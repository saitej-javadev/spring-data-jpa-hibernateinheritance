-- create table payment( id int PRIMARY KEY	, amount decimal(8,3));


-- create table card(id int,cardnumber varchar(20), foreign key(id) REFERENCES payment(id));
-- create table bankcheck(id int,checknumber varchar(20), foreign key(id) REFERENCES payment(id));