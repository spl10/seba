# --- Sample dataset

# --- !Ups

Insert into login (ID_prof, ProfName, Password) values (1,'bruegge', 'test1');
Insert into login (ID_prof, ProfName, Password) values (2,'jacobson', 'test2');


# --- !Downs

delete from login;