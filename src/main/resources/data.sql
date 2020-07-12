insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(1,'Chennai','0.1.2.3.66', '12.33.66.88', 'Tamil Nadu','MAS','Chennai Central');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(2,'OLD DELHI','0.2.2.3.66', '12.33.66.8878', 'Delhi','DLI','Old Delhi Central');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(3,'SUBZI MANDI','05.1.2.3.66', '12.33.3666.88', 'Maharastra','SZM','Subiz Mandi');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(4,'BADLI','0.1.2.3.566', '12.33.66.8418', 'Tamil Nadu','BHD','Baldi');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(5,'NARELA','0.1.2.3.866', '12.33.66.8568', 'Tamil Nadu','NUR','Narela');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(6,'SONIPAT','0.1.2.3.466', '12.33.66.8478', 'Tamil Nadu','SNP','Sonipat');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(7,'GANAUR','0.1.2.3.664', '12.33.66.8458', 'Tamil Nadu','GNU','SAMALKHA');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(8,'SAMALKHA','0.1.2.3.616', '12.33.66.8448', 'Tamil Nadu','SMK','Smalakha JN');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(9,'PANIPAT','0.1.2.3.666', '12.33.66.5588', 'Tamil Nadu','PNP','PANIPAT JN');
insert into station(STATION_ID ,CITY ,LATITUDE ,LONGITUDE ,STATE ,STATION_CODE ,STATION_NAME ) values(10,'KARNAL','0.1.2.3.662', '12.33.6896.88', 'Tamil Nadu','KUN','KARNAL Central');

insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (1, 'Delhi', 'Chennai', 'Test Express1', '1234', 'Express','R');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (2, 'Chennai', 'Delhi', 'Test Express2', '4567', 'Express','R');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (3, 'Erode', 'Chennai', 'Test Express3', '8910', 'Super Fast','R');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (4, 'Chennai', 'Erode', 'Test Express4', '111213', 'Express','R');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (5, 'Kovai', 'Chennai', 'Test Express5', '141516', 'Super Fast','R');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (6, 'Chennai', 'Kovai', 'Test Express6', '171819', 'Express','N');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (7, 'Kovai', 'Chennai', 'Test Express7', '202122', 'Express','C');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (8, 'Salem', 'Chennai', 'Test Express8', '23242526', 'Super Fast','R');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (9, 'Chennai', 'Kovai', 'Test Express9', '282930', 'Express','R');
insert into TRAIN_DETAIL (TRAIN_ID ,DESTINATION ,SOURCE ,TRAIN_NAME ,TRAIN_NUMBER ,TYPE ,STATUS) Values (10, 'Chennai', 'Delhi', 'Test Express10', '303132', 'Express','R');

insert into TRAIN_SCHEDULE (TRAIN_SCHEDULE_ID ,ARRIVAL ,DEPATURE ,PLATFORM ,STATION_ID ,TRAIN_ID) Values (1, '06:00:00', '06:10:00', 8, 1, 1);
insert into TRAIN_SCHEDULE (TRAIN_SCHEDULE_ID ,ARRIVAL ,DEPATURE ,PLATFORM ,STATION_ID ,TRAIN_ID) Values (2, '06:00:00', '06:10:00', 10, 1, 2);
insert into TRAIN_SCHEDULE (TRAIN_SCHEDULE_ID ,ARRIVAL ,DEPATURE ,PLATFORM ,STATION_ID ,TRAIN_ID) Values (3, '08:00:00', '08:10:00', 2, 1, 3);
insert into TRAIN_SCHEDULE (TRAIN_SCHEDULE_ID ,ARRIVAL ,DEPATURE ,PLATFORM ,STATION_ID ,TRAIN_ID) Values (4, '09:00:00', '09:10:00', 3, 1, 4);
insert into TRAIN_SCHEDULE (TRAIN_SCHEDULE_ID ,ARRIVAL ,DEPATURE ,PLATFORM ,STATION_ID ,TRAIN_ID) Values (5, '13:00:00', '13:10:00', 4, 1, 5);
insert into TRAIN_SCHEDULE (TRAIN_SCHEDULE_ID ,ARRIVAL ,DEPATURE ,PLATFORM ,STATION_ID ,TRAIN_ID) Values (6, '22:00:00', '22:10:00', 8, 1, 6);
insert into TRAIN_SCHEDULE (TRAIN_SCHEDULE_ID ,ARRIVAL ,DEPATURE ,PLATFORM ,STATION_ID ,TRAIN_ID) Values (7, '22:00:00', '22:10:00', 9, 1, 7);

insert into TRAIN_SCHEDULE (TRAIN_SCHEDULE_ID ,ARRIVAL ,DEPATURE ,PLATFORM ,STATION_ID ,TRAIN_ID) Values (8, '23:00:00', '23:05:00', 9, 2, 1);

insert into TRAIN_ROUTE (TRAIN_ROUTE_ID ,ROUTE_SEQ ,STATION_ID ,TRAIN_ID ) Values (1, 0, 1, 1);
insert into TRAIN_ROUTE (TRAIN_ROUTE_ID ,ROUTE_SEQ ,STATION_ID ,TRAIN_ID ) Values (2, 1, 2, 1);
insert into TRAIN_ROUTE (TRAIN_ROUTE_ID ,ROUTE_SEQ ,STATION_ID ,TRAIN_ID ) Values (3, 2, 3, 1);

insert into TRAIN_ROUTE (TRAIN_ROUTE_ID ,ROUTE_SEQ ,STATION_ID ,TRAIN_ID ) Values (4, 0, 1, 2);
insert into TRAIN_ROUTE (TRAIN_ROUTE_ID ,ROUTE_SEQ ,STATION_ID ,TRAIN_ID ) Values (5, 1, 2, 2);
insert into TRAIN_ROUTE (TRAIN_ROUTE_ID ,ROUTE_SEQ ,STATION_ID ,TRAIN_ID ) Values (6, 2, 3, 2);
insert into TRAIN_ROUTE (TRAIN_ROUTE_ID ,ROUTE_SEQ ,STATION_ID ,TRAIN_ID ) Values (7, 3, 4, 2);
insert into TRAIN_ROUTE (TRAIN_ROUTE_ID ,ROUTE_SEQ ,STATION_ID ,TRAIN_ID ) Values (8, 4, 5, 2);

