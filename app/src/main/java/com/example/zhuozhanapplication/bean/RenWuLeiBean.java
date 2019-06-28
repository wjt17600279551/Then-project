package com.example.zhuozhanapplication.bean;

import java.util.List;

public class RenWuLeiBean {

    /**
     * code : 1
     * statusMsg : success
     * data : [{"id":5,"createUserId":1,"name":"测试审核通过案件1","number":"TEST002","filingTime":"2019-06-18 02:13:15","finishTime":null,"responsibleUserId":1,"description":"测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1","createTime":"2019-06-24 02:15:10","type":null,"status":1,"remarks1":null,"remarks2":null,"actionObjectList":[{"id":2,"caseId":5,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"张三","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 20:42:48","description":null},{"id":3,"caseId":5,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"李四","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 20:50:15","description":null},{"id":4,"caseId":5,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"王五","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 20:53:11","description":null}]},{"id":7,"createUserId":null,"name":"测试审核通过案件2","number":"TEST004","filingTime":"2019-06-10 02:13:27","finishTime":null,"responsibleUserId":1,"description":"测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2测试审核通过案件2","createTime":"2019-06-24 02:15:17","type":null,"status":1,"remarks1":null,"remarks2":null,"actionObjectList":[{"id":5,"caseId":7,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"张三1","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 20:56:27","description":null},{"id":6,"caseId":7,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"李四1","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 21:08:58","description":null},{"id":7,"caseId":7,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"王五1","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 21:19:26","description":null}]}]
     * status : 200
     */

    private int code;
    private String statusMsg;
    private int status;
    private List<DataBean> data;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 5
         * createUserId : 1
         * name : 测试审核通过案件1
         * number : TEST002
         * filingTime : 2019-06-18 02:13:15
         * finishTime : null
         * responsibleUserId : 1
         * description : 测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1测试审核通过案件1
         * createTime : 2019-06-24 02:15:10
         * type : null
         * status : 1
         * remarks1 : null
         * remarks2 : null
         * actionObjectList : [{"id":2,"caseId":5,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"张三","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 20:42:48","description":null},{"id":3,"caseId":5,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"李四","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 20:50:15","description":null},{"id":4,"caseId":5,"picUrl":"http://127.0.0.1/pic/a.jpg","name":"王五","sex":1,"phone":"13112345678","idNumber":"123456789012345","province":"北京市","city":"北京市","area":"朝阳区","traffic":"火车","residence":"住所","remarks1":null,"remarks2":null,"createTime":"2019-06-17 20:53:11","description":null}]
         */

        private int id;
        private int createUserId;
        private String name;
        private String number;
        private String filingTime;
        private Object finishTime;
        private int responsibleUserId;
        private String description;
        private String createTime;
        private Object type;
        private int status;
        private Object remarks1;
        private Object remarks2;
        private List<ActionObjectListBean> actionObjectList;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCreateUserId() {
            return createUserId;
        }

        public void setCreateUserId(int createUserId) {
            this.createUserId = createUserId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getFilingTime() {
            return filingTime;
        }

        public void setFilingTime(String filingTime) {
            this.filingTime = filingTime;
        }

        public Object getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(Object finishTime) {
            this.finishTime = finishTime;
        }

        public int getResponsibleUserId() {
            return responsibleUserId;
        }

        public void setResponsibleUserId(int responsibleUserId) {
            this.responsibleUserId = responsibleUserId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public Object getRemarks1() {
            return remarks1;
        }

        public void setRemarks1(Object remarks1) {
            this.remarks1 = remarks1;
        }

        public Object getRemarks2() {
            return remarks2;
        }

        public void setRemarks2(Object remarks2) {
            this.remarks2 = remarks2;
        }

        public List<ActionObjectListBean> getActionObjectList() {
            return actionObjectList;
        }

        public void setActionObjectList(List<ActionObjectListBean> actionObjectList) {
            this.actionObjectList = actionObjectList;
        }

        public static class ActionObjectListBean {
            /**
             * id : 2
             * caseId : 5
             * picUrl : http://127.0.0.1/pic/a.jpg
             * name : 张三
             * sex : 1
             * phone : 13112345678
             * idNumber : 123456789012345
             * province : 北京市
             * city : 北京市
             * area : 朝阳区
             * traffic : 火车
             * residence : 住所
             * remarks1 : null
             * remarks2 : null
             * createTime : 2019-06-17 20:42:48
             * description : null
             */

            private int id;
            private int caseId;
            private String picUrl;
            private String name;
            private int sex;
            private String phone;
            private String idNumber;
            private String province;
            private String city;
            private String area;
            private String traffic;
            private String residence;
            private Object remarks1;
            private Object remarks2;
            private String createTime;
            private Object description;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getCaseId() {
                return caseId;
            }

            public void setCaseId(int caseId) {
                this.caseId = caseId;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getIdNumber() {
                return idNumber;
            }

            public void setIdNumber(String idNumber) {
                this.idNumber = idNumber;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getTraffic() {
                return traffic;
            }

            public void setTraffic(String traffic) {
                this.traffic = traffic;
            }

            public String getResidence() {
                return residence;
            }

            public void setResidence(String residence) {
                this.residence = residence;
            }

            public Object getRemarks1() {
                return remarks1;
            }

            public void setRemarks1(Object remarks1) {
                this.remarks1 = remarks1;
            }

            public Object getRemarks2() {
                return remarks2;
            }

            public void setRemarks2(Object remarks2) {
                this.remarks2 = remarks2;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public Object getDescription() {
                return description;
            }

            public void setDescription(Object description) {
                this.description = description;
            }
        }
    }
}
