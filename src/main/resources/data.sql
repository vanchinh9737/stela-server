INSERT INTO car (license_plate, repair_date , customer_name           , catalog          , car_maker)
VALUES          ('29V7-65366' , '2003-11-16', 'Nguyễn Ngọc Minh Trang', 'Bảo dưỡng lần 1', 'Honda'  ),
                ('29V7-52143' , '2021-03-05', 'Nguyễn Văn Khoa'       , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('37H1-23560' , '2023-02-03', 'giàng a phò'           , 'Bảo dưỡng lần 1', 'nissan' ),
                ('89X2-45214' , '2023-11-03', 'Cá nóc'                , 'Bảo dưỡng lần 3', 'Nam ngư' ),
                ('63G72-98526', '2023-11-08', 'Xuân tóc đỏ'           , 'Bảo dưỡng lần 2', 'Nếp cái hoa vàng' );

INSERT INTO accessory (license_plate, repair_date , name         , price  , status_damaged, repair_status)
VALUES                ('29V7-52143' , '2021-03-05', 'Cần gạt mưa', 999000 , 'Bị gãy'      , 'Thay mới'   ),
                      ('29V7-65366' , '2003-11-16', 'Lọc gió'    , 199000 , 'Bị bụi bẩn'  , 'Làm sạch'   ),
                      ('29V7-65366' , '2003-11-16', 'Lốp xe'     , 2000000, 'Bị thủng'    , 'Thay lốp'   ),
                      ('29V7-65366' , '2003-11-16', 'Bình ắc quy', 1465000, 'Bị hết điện' , 'Sạc điện'   ),
                      ('29V7-65366' , '2003-11-16', 'Đèn xe'     , 369000 , 'Bị vỡ'       , 'Thay đèn'   ),
                      ('37H1-23560' , '2023-02-03', 'Mũ cối'     , 500000 , 'Bị Mất'      , 'Thay mũ'    ),
                      ('89X2-45214' , '2023-11-03', 'Hác Măng'   , 200000 , 'Bị Bốc hơi'  , 'Thay ac quy'),
                      ('63G72-98526', '2023-11-08', 'Lọc dầu'    , 250500 , 'Bị méo'      , 'Mua mới'    );