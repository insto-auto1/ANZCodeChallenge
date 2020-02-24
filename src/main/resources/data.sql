insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values ('585309209', 'SGSAVINGS726', 0, now(), 1, 84327.51);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('791066619', 'AUSAVINGS933', 0, now(), 2, 88005.93);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('321143048', 'AUCURRENT433', 1, now(), 2, 38010.62);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('347546123', 'SGCURRENT166', 1, now(), 1, 50664.65);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('680456441', 'AUCURRENT374', 1, now(), 2, 41327.28);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('136151648', 'AUCURRENT938', 0, now(), 2, 48928.79);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('453489511', 'SGSAVINGS842', 0, now(), 1, 72117.53);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('334651897', 'AUSAVINGS253', 0, now(), 2, 88005.93);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('793445614', 'AUCURRENT754', 1, now(), 2, 20588.16);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('768456461', 'SGCURRENT294', 1, now(), 1, 590655);
insert into account (account_number, account_name, account_type, balance_date, currency_code, opening_available_balance) values('847498496', 'AUCURRENT591', 1, now(), 2, 925613.68);




insert into transaction (account_number, account_name, credit_amount, currency_code, debit_amount, debit_credit, transaction_narrative, value_date, transaction_id) values
('847498496', 'AUCURRENT591', 20.000, 1,  900.98, 1, 'Some credit',  now(), 123456789);
insert into transaction (account_number, account_name, credit_amount, currency_code, debit_amount, debit_credit, transaction_narrative, value_date, transaction_id) values
('847498496', 'AUCURRENT591', 20.000, 1,  320.98, 1, 'Some credit',  now(), 123456788);
insert into transaction (account_number, account_name, credit_amount, currency_code, debit_amount, debit_credit, transaction_narrative, value_date, transaction_id) values
('847498496', 'AUCURRENT591', 20.000, 1,  213.98, 0, 'Some Debit 223',  now(), 123456787);
insert into transaction (account_number, account_name, credit_amount, currency_code, debit_amount, debit_credit, transaction_narrative, value_date, transaction_id) values
('847498496', 'AUCURRENT591', 20.000, 1,  970.98, 0, 'Some Debit',  now(), 123456786);




insert into transaction (account_number, account_name, credit_amount, currency_code, debit_amount, debit_credit, transaction_narrative, value_date, transaction_id) values
('585309209', 'SGSAVINGS726', 20.000, 0,  900.98, 1, 'Some credit',  now(), 123456799);
insert into transaction (account_number, account_name, credit_amount, currency_code, debit_amount, debit_credit, transaction_narrative, value_date, transaction_id) values
('585309209', 'SGSAVINGS726', 20.000, 0,  320.98, 1, 'Some credit',  now(), 123456798);
insert into transaction (account_number, account_name, credit_amount, currency_code, debit_amount, debit_credit, transaction_narrative, value_date, transaction_id) values
('585309209', 'SGSAVINGS726', 20.000, 0,  213.98, 0, 'Some Debit 223',  now(), 123456797);
insert into transaction (account_number, account_name, credit_amount, currency_code, debit_amount, debit_credit, transaction_narrative, value_date, transaction_id) values
('585309209', 'SGSAVINGS726', 20.000, 0,  970.98, 0, 'Some Debit',  now(), 123456796);