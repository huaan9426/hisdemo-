# hisdemo-
基于Spring Boot的医院信息管理系统（HIS）模拟项目，包含患者管理、科室管理和医生管理基础模块，采用MVC架构实现Web界面操作。
## 功能特性
### 科室管理模块
- ✅ 科室信息增删改查
- ✅ 动态表单验证
- ✅ Bootstrap响应式布局
- ✅ 操作确认对话框
### 患者管理模块
- ✅ 患者档案管理
- ✅ 年龄有效性校验
- ✅ 联系方式格式验证
### 医生管理模块
- ✅ 医生信息管理
- ✅ 科室关联管理
- ✅ 排班信息展示
src/main/java
├── com.xiaoming.spring
│   ├── entity          # 数据实体
│   ├── repository      # 数据访问层
│   ├── service         # 业务逻辑层
│   └── WebController   # 控制器层
resources
├── static             # 静态资源
│   └── css
└── templates          # 视图模板
    └── department     # 科室相关页面
    └── doctor     # 科室相关页面
    └── patient     # 科室相关页面

数据库：
患者表（patient）：
CREATE TABLE patient (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT,
    gender VARCHAR(10),
    contact VARCHAR(50)
);
科室表（department）：
CREATE TABLE department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(100)
);
医生表（doctor）：
CREATE TABLE doctor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    department_id INT,
    contact VARCHAR(50),
    FOREIGN KEY (department_id) REFERENCES department(id)
);
