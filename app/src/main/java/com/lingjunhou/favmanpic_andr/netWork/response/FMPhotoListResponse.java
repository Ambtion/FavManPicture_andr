package com.lingjunhou.favmanpic_andr.netWork.response;

import java.util.List;

public class FMPhotoListResponse {


    /**
     * data : {"limit":10,"page":1,"list":[{"id":2715,"authorId":194586,"sourceId":6,"issue":443,"title":"昨天又做了后悔的事","headImageFilename":"9.jpg","pictureCount":24,"level":0,"vip":0,"createTime":1542644102000,"favoriteCount":53,"source":{"id":6,"name":"美媛馆","catalog":"mygirl","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":194586,"nickname":"李七喜","headerUrl":"LiQiXi.jpg","sex":2,"height":"160","weight":"38","bwh":"90-60-89","birthday":"1994-12-24","area":"长沙"},"favorite":false},{"id":2714,"authorId":100190,"sourceId":4,"issue":411,"title":"桃尻かのん","headImageFilename":"14.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542643839000,"favoriteCount":34,"source":{"id":4,"name":"日韩","catalog":"graphis","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100190,"nickname":"小丝","headerUrl":"XiaoSi.jpg","sex":2,"height":"168","weight":"53","bwh":"91-52-90","birthday":"1993-01-15","area":"北京"},"favorite":false},{"id":2713,"authorId":100002,"sourceId":2,"issue":254,"title":"如果能重来，我要学李白","headImageFilename":"0.jpg","pictureCount":26,"level":5,"vip":1,"createTime":1542643542000,"favoriteCount":129,"source":{"id":2,"name":"爱丝","catalog":"aiss","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100002,"nickname":"若兮","headerUrl":"RuoXi.jpg","sex":2,"height":"169","weight":"53","bwh":"71-52-78","birthday":"1989-07-23","area":"上海"},"favorite":false},{"id":2712,"authorId":100190,"sourceId":9,"issue":431,"title":"Mashup Best of Ukrainians","headImageFilename":"20.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542557725000,"favoriteCount":44,"source":{"id":9,"name":"Playboy","catalog":"playboy","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100190,"nickname":"小丝","headerUrl":"XiaoSi.jpg","sex":2,"height":"168","weight":"53","bwh":"91-52-90","birthday":"1993-01-15","area":"北京"},"favorite":false},{"id":2711,"authorId":194660,"sourceId":8,"issue":442,"title":"这么久不知道学会了什么","headImageFilename":"20.jpg","pictureCount":24,"level":1,"vip":1,"createTime":1542557440000,"favoriteCount":33,"source":{"id":8,"name":"尤果网","catalog":"ugirls","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":194660,"nickname":"Orange","headerUrl":"Orange.jpg","sex":2,"height":"174","weight":"52","bwh":"90-62-90","birthday":"1993-04-21","area":"北京"},"favorite":false},{"id":2710,"authorId":194471,"sourceId":7,"issue":442,"title":"人生最重要的是找到正确的方向","headImageFilename":"7.jpg","pictureCount":24,"level":2,"vip":1,"createTime":1542557116000,"favoriteCount":91,"source":{"id":7,"name":"秀人网","catalog":"xiuren","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":194471,"nickname":"咕噜","headerUrl":"GuLu.jpg","sex":2,"height":"164","weight":"45","bwh":"89-62-89","birthday":"1991-07-20","area":"北京"},"favorite":false},{"id":2709,"authorId":194626,"sourceId":6,"issue":442,"title":"女人的本能 [偷笑]","headImageFilename":"14.jpg","pictureCount":24,"level":2,"vip":1,"createTime":1542471314000,"favoriteCount":125,"source":{"id":6,"name":"美媛馆","catalog":"mygirl","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":194626,"nickname":"范范","headerUrl":"FanFan.jpg","sex":2,"height":"165","weight":"50","bwh":"91-64-89","birthday":"1999-01-01","area":"武汉"},"favorite":false},{"id":2708,"authorId":100190,"sourceId":4,"issue":410,"title":"松本菜奈実","headImageFilename":"15.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542471057000,"favoriteCount":86,"source":{"id":4,"name":"日韩","catalog":"graphis","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100190,"nickname":"小丝","headerUrl":"XiaoSi.jpg","sex":2,"height":"168","weight":"53","bwh":"91-52-90","birthday":"1993-01-15","area":"北京"},"favorite":false},{"id":2707,"authorId":100001,"sourceId":3,"issue":229,"title":"不以物喜不以己悲","headImageFilename":"0.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542470737000,"favoriteCount":246,"source":{"id":3,"name":"推女郎","catalog":"tuigirl","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100001,"nickname":"赵惟依","headerUrl":"ZhaoWeiYi.jpg","sex":2,"height":"167","weight":"54","bwh":"65-55-75","birthday":"1988-11-01","area":"北京"},"favorite":false},{"id":2706,"authorId":100190,"sourceId":9,"issue":430,"title":"Andrea Trivuncic","headImageFilename":"0.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542384914000,"favoriteCount":82,"source":{"id":9,"name":"Playboy","catalog":"playboy","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100190,"nickname":"小丝","headerUrl":"XiaoSi.jpg","sex":2,"height":"168","weight":"53","bwh":"91-52-90","birthday":"1993-01-15","area":"北京"},"favorite":false}]}
     * msg : 操作成功
     * success : true
     */

    private data data;
    private String msg;
    private boolean success;

    public data getData() {
        return data;
    }

    public void setData(data data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class data {
        /**
         * limit : 10
         * page : 1
         * list : [{"id":2715,"authorId":194586,"sourceId":6,"issue":443,"title":"昨天又做了后悔的事","headImageFilename":"9.jpg","pictureCount":24,"level":0,"vip":0,"createTime":1542644102000,"favoriteCount":53,"source":{"id":6,"name":"美媛馆","catalog":"mygirl","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":194586,"nickname":"李七喜","headerUrl":"LiQiXi.jpg","sex":2,"height":"160","weight":"38","bwh":"90-60-89","birthday":"1994-12-24","area":"长沙"},"favorite":false},{"id":2714,"authorId":100190,"sourceId":4,"issue":411,"title":"桃尻かのん","headImageFilename":"14.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542643839000,"favoriteCount":34,"source":{"id":4,"name":"日韩","catalog":"graphis","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100190,"nickname":"小丝","headerUrl":"XiaoSi.jpg","sex":2,"height":"168","weight":"53","bwh":"91-52-90","birthday":"1993-01-15","area":"北京"},"favorite":false},{"id":2713,"authorId":100002,"sourceId":2,"issue":254,"title":"如果能重来，我要学李白","headImageFilename":"0.jpg","pictureCount":26,"level":5,"vip":1,"createTime":1542643542000,"favoriteCount":129,"source":{"id":2,"name":"爱丝","catalog":"aiss","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100002,"nickname":"若兮","headerUrl":"RuoXi.jpg","sex":2,"height":"169","weight":"53","bwh":"71-52-78","birthday":"1989-07-23","area":"上海"},"favorite":false},{"id":2712,"authorId":100190,"sourceId":9,"issue":431,"title":"Mashup Best of Ukrainians","headImageFilename":"20.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542557725000,"favoriteCount":44,"source":{"id":9,"name":"Playboy","catalog":"playboy","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100190,"nickname":"小丝","headerUrl":"XiaoSi.jpg","sex":2,"height":"168","weight":"53","bwh":"91-52-90","birthday":"1993-01-15","area":"北京"},"favorite":false},{"id":2711,"authorId":194660,"sourceId":8,"issue":442,"title":"这么久不知道学会了什么","headImageFilename":"20.jpg","pictureCount":24,"level":1,"vip":1,"createTime":1542557440000,"favoriteCount":33,"source":{"id":8,"name":"尤果网","catalog":"ugirls","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":194660,"nickname":"Orange","headerUrl":"Orange.jpg","sex":2,"height":"174","weight":"52","bwh":"90-62-90","birthday":"1993-04-21","area":"北京"},"favorite":false},{"id":2710,"authorId":194471,"sourceId":7,"issue":442,"title":"人生最重要的是找到正确的方向","headImageFilename":"7.jpg","pictureCount":24,"level":2,"vip":1,"createTime":1542557116000,"favoriteCount":91,"source":{"id":7,"name":"秀人网","catalog":"xiuren","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":194471,"nickname":"咕噜","headerUrl":"GuLu.jpg","sex":2,"height":"164","weight":"45","bwh":"89-62-89","birthday":"1991-07-20","area":"北京"},"favorite":false},{"id":2709,"authorId":194626,"sourceId":6,"issue":442,"title":"女人的本能 [偷笑]","headImageFilename":"14.jpg","pictureCount":24,"level":2,"vip":1,"createTime":1542471314000,"favoriteCount":125,"source":{"id":6,"name":"美媛馆","catalog":"mygirl","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":194626,"nickname":"范范","headerUrl":"FanFan.jpg","sex":2,"height":"165","weight":"50","bwh":"91-64-89","birthday":"1999-01-01","area":"武汉"},"favorite":false},{"id":2708,"authorId":100190,"sourceId":4,"issue":410,"title":"松本菜奈実","headImageFilename":"15.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542471057000,"favoriteCount":86,"source":{"id":4,"name":"日韩","catalog":"graphis","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100190,"nickname":"小丝","headerUrl":"XiaoSi.jpg","sex":2,"height":"168","weight":"53","bwh":"91-52-90","birthday":"1993-01-15","area":"北京"},"favorite":false},{"id":2707,"authorId":100001,"sourceId":3,"issue":229,"title":"不以物喜不以己悲","headImageFilename":"0.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542470737000,"favoriteCount":246,"source":{"id":3,"name":"推女郎","catalog":"tuigirl","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100001,"nickname":"赵惟依","headerUrl":"ZhaoWeiYi.jpg","sex":2,"height":"167","weight":"54","bwh":"65-55-75","birthday":"1988-11-01","area":"北京"},"favorite":false},{"id":2706,"authorId":100190,"sourceId":9,"issue":430,"title":"Andrea Trivuncic","headImageFilename":"0.jpg","pictureCount":24,"level":3,"vip":1,"createTime":1542384914000,"favoriteCount":82,"source":{"id":9,"name":"Playboy","catalog":"playboy","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0},"author":{"id":100190,"nickname":"小丝","headerUrl":"XiaoSi.jpg","sex":2,"height":"168","weight":"53","bwh":"91-52-90","birthday":"1993-01-15","area":"北京"},"favorite":false}]
         */

        private int limit;
        private int page;
        private List<GroupList> list;

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public List<GroupList> getList() {
            return list;
        }

        public void setList(List<GroupList> list) {
            this.list = list;
        }

        public static class GroupList {
            /**
             * id : 2715
             * authorId : 194586
             * sourceId : 6
             * issue : 443
             * title : 昨天又做了后悔的事
             * headImageFilename : 9.jpg
             * pictureCount : 24
             * level : 0
             * vip : 0
             * createTime : 1542644102000
             * favoriteCount : 53
             * source : {"id":6,"name":"美媛馆","catalog":"mygirl","hearderImagePath":null,"lastSuiteId":0,"suiteCount":0,"pictureCount":0}
             * author : {"id":194586,"nickname":"李七喜","headerUrl":"LiQiXi.jpg","sex":2,"height":"160","weight":"38","bwh":"90-60-89","birthday":"1994-12-24","area":"长沙"}
             * favorite : false
             */

            private int id;
            private int authorId;
            private int sourceId;
            private int issue;
            private String title;
            private String headImageFilename;
            private int pictureCount;
            private int level;
            private int vip;
            private long createTime;
            private int favoriteCount;
            private Source source;
            private Author author;
            private boolean favorite;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getAuthorId() {
                return authorId;
            }

            public void setAuthorId(int authorId) {
                this.authorId = authorId;
            }

            public int getSourceId() {
                return sourceId;
            }

            public void setSourceId(int sourceId) {
                this.sourceId = sourceId;
            }

            public int getIssue() {
                return issue;
            }

            public void setIssue(int issue) {
                this.issue = issue;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getHeadImageFilename() {
                return headImageFilename;
            }

            public void setHeadImageFilename(String headImageFilename) {
                this.headImageFilename = headImageFilename;
            }

            public int getPictureCount() {
                return pictureCount;
            }

            public void setPictureCount(int pictureCount) {
                this.pictureCount = pictureCount;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getVip() {
                return vip;
            }

            public void setVip(int vip) {
                this.vip = vip;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public int getFavoriteCount() {
                return favoriteCount;
            }

            public void setFavoriteCount(int favoriteCount) {
                this.favoriteCount = favoriteCount;
            }

            public Source getSource() {
                return source;
            }

            public void setSource(Source source) {
                this.source = source;
            }

            public Author getAuthor() {
                return author;
            }

            public void setAuthor(Author author) {
                this.author = author;
            }

            public boolean isFavorite() {
                return favorite;
            }

            public void setFavorite(boolean favorite) {
                this.favorite = favorite;
            }

            public static class Source {
                /**
                 * id : 6
                 * name : 美媛馆
                 * catalog : mygirl
                 * hearderImagePath : null
                 * lastSuiteId : 0
                 * suiteCount : 0
                 * pictureCount : 0
                 */

                private int id;
                private String name;
                private String catalog;
                private Object hearderImagePath;
                private int lastSuiteId;
                private int suiteCount;
                private int pictureCount;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCatalog() {
                    return catalog;
                }

                public void setCatalog(String catalog) {
                    this.catalog = catalog;
                }

                public Object getHearderImagePath() {
                    return hearderImagePath;
                }

                public void setHearderImagePath(Object hearderImagePath) {
                    this.hearderImagePath = hearderImagePath;
                }

                public int getLastSuiteId() {
                    return lastSuiteId;
                }

                public void setLastSuiteId(int lastSuiteId) {
                    this.lastSuiteId = lastSuiteId;
                }

                public int getSuiteCount() {
                    return suiteCount;
                }

                public void setSuiteCount(int suiteCount) {
                    this.suiteCount = suiteCount;
                }

                public int getPictureCount() {
                    return pictureCount;
                }

                public void setPictureCount(int pictureCount) {
                    this.pictureCount = pictureCount;
                }
            }

            public static class Author {
                /**
                 * id : 194586
                 * nickname : 李七喜
                 * headerUrl : LiQiXi.jpg
                 * sex : 2
                 * height : 160
                 * weight : 38
                 * bwh : 90-60-89
                 * birthday : 1994-12-24
                 * area : 长沙
                 */

                private int id;
                private String nickname;
                private String headerUrl;
                private int sex;
                private String height;
                private String weight;
                private String bwh;
                private String birthday;
                private String area;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getHeaderUrl() {
                    return headerUrl;
                }

                public void setHeaderUrl(String headerUrl) {
                    this.headerUrl = headerUrl;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public String getHeight() {
                    return height;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getWeight() {
                    return weight;
                }

                public void setWeight(String weight) {
                    this.weight = weight;
                }

                public String getBwh() {
                    return bwh;
                }

                public void setBwh(String bwh) {
                    this.bwh = bwh;
                }

                public String getBirthday() {
                    return birthday;
                }

                public void setBirthday(String birthday) {
                    this.birthday = birthday;
                }

                public String getArea() {
                    return area;
                }

                public void setArea(String area) {
                    this.area = area;
                }
            }
        }
    }
}

