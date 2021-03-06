package com.example.common;

public class Common {

    // connect the database
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_NAME = "psms";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1QAZxcde32@";
    public static final String IP = "10.0.18.111";
    public static final String PORT = "3306";
    public static final String URL = "jdbc:mysql://" + IP + ":" + PORT + "/" + DB_NAME+"?useUnicode=true&characterEncoding=utf-8&useSSL=false";

    // path
    public static final String EXCEL_SAVE_PATH = "excel/src/main/resources/lib/student01.xlsx";
    public static final String EXCEL_OUTPUT_PATH = "excel/src/main/resources/lib/student02.xlsx";
    public static final String EXCEL_OUTPUT_PATH1 = "D:/模板.xlsx";

    // sql
    public static final String INSERT_STUDENT_SQL = "insert into student_info(no, name, age, score) values(?, ?, ?, ?)";
    public static final String UPDATE_STUDENT_SQL = "update student_info set no = ?, name = ?, age= ?, score = ? where id = ? ";
    public static final String SELECT_STUDENT_ALL_SQL = "select id,name from student_info";
    public static final String SELECT_STUDENT_SQL = "select * from student_info where name like ";

    public static final String SELECT_City_Name = "select id,city_name from t_psms_address where 1=1 ";
    public static final String SELECT_Place_Name = "select id,place_name from t_psms_address where 1=1 ";
    public static final String SELECT_Province_Name = "select DISTINCT province_name from t_psms_address where 1=1 ";
    public static final String UPDATE_City_Name = "UPDATE t_psms_address SET city_name=? where id=? ";
    public static final String EXCEL_SAVE_PATH = "D:/生产安全事故应急预案备案.xlsx";
}
