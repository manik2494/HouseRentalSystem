create table if not exists owner(
	owner_id varchar(20) primary key,
    name varchar(25),
    password varchar(25),
    email_id varchar(25),
    phone_no varchar(10),
    rating double
);

create table if not exists tenant(
	tenant_id varchar(20) primary key,
    name varchar(25),
    password varchar(25),
    email_id varchar(25),
    phone_no varchar(10)
);

create table if not exists house(
	house_id int primary key auto_increment,
    area double,
    age int,
    street varchar(100),
    city varchar(20),
    state varchar(15),
    description_house varchar(200),
    bedrooms int,
    halls int,
    kitchens int,
    rent int,
    end_date date,
    owner_id varchar(20),
    isoccupied bool,
    rating double
);

create table if not exists reviewHouse(
	tenant_id varchar(20),
    house_id int,
    decription varchar(200),
    rating int,
    constraint pk_reviewHouse primary key(tenant_id, house_id),
    constraint fk_reviewedHouse foreign key(house_id) references house(house_id),
    constraint fk_reviewedHouseByTenant foreign key(tenant_id) references tenant(tenant_id)
);

create table if not exists reviewOwner(
	tenant_id varchar(20),
    owner_id varchar(20),
    decription varchar(200),
    rating int,
    constraint pk_reviewOwner primary key(tenant_id, owner_id),
    constraint fk_reviewedOwner foreign key(owner_id) references owner(owner_id),
    constraint fk_reviewedOwnerByTenant foreign key(tenant_id) references tenant(tenant_id)
);

create table if not exists hidden(
	tenant_id varchar(20),
    house_id int,
    constraint pk_hideHouse primary key(tenant_id, house_id),
    constraint fk_hiddenHouse foreign key(house_id) references house(house_id),
    constraint fk_hiddenHouseByTenant foreign key(tenant_id) references tenant(tenant_id)
);

create table if not exists bookmark(
	tenant_id varchar(20),
    house_id int,
    constraint pk_bookmarkHouse primary key(tenant_id, house_id),
    constraint fk_bookmarkedHouse foreign key(house_id) references house(house_id),
    constraint fk_bookmarkedHouseByTenant foreign key(tenant_id) references tenant(tenant_id)
);

create table if not exists appointment(
	tenant_id varchar(20),
    house_id int,
    date_appoint date,
    time_appoint time,
    constraint pk_appointment primary key(tenant_id, house_id),
    constraint fk_appointment foreign key(house_id) references house(house_id),
    constraint fk_appointmentOf foreign key(tenant_id) references tenant(tenant_id)
);

alter table house add constraint fk_houseOwner foreign key(owner_id) references owner(owner_id);
