package com.example.zhuozhanapplication;

public class ChengGongBean {


    /**
     * code : 1
     * statusMsg : success
     * data : {"id":2,"username":"测试用户2","createTime":"2019-06-21 03:00:37","lastLoginTime":null,"updateTime":null,"type":null,"status":null,"departmentId":null,"employer":"工作单位2","phone":null,"duty":null,"remarks1":"李四","remarks2":null,"sex":1,"realName":null}
     * status : 200
     */

    private int code;
    private String statusMsg;
    private DataBean data;
    private int status;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * id : 2
         * username : 测试用户2
         * createTime : 2019-06-21 03:00:37
         * lastLoginTime : null
         * updateTime : null
         * type : null
         * status : null
         * departmentId : null
         * employer : 工作单位2
         * phone : null
         * duty : null
         * remarks1 : 李四
         * remarks2 : null
         * sex : 1
         * realName : null
         */

        private int id;
        private String username;
        private String createTime;
        private Object lastLoginTime;
        private Object updateTime;
        private Object type;
        private Object status;
        private Object departmentId;
        private String employer;
        private Object phone;
        private Object duty;
        private String remarks1;
        private Object remarks2;
        private int sex;
        private Object realName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getLastLoginTime() {
            return lastLoginTime;
        }

        public void setLastLoginTime(Object lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public Object getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(Object departmentId) {
            this.departmentId = departmentId;
        }

        public String getEmployer() {
            return employer;
        }

        public void setEmployer(String employer) {
            this.employer = employer;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public Object getDuty() {
            return duty;
        }

        public void setDuty(Object duty) {
            this.duty = duty;
        }

        public String getRemarks1() {
            return remarks1;
        }

        public void setRemarks1(String remarks1) {
            this.remarks1 = remarks1;
        }

        public Object getRemarks2() {
            return remarks2;
        }

        public void setRemarks2(Object remarks2) {
            this.remarks2 = remarks2;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public Object getRealName() {
            return realName;
        }

        public void setRealName(Object realName) {
            this.realName = realName;
        }
    }
}
