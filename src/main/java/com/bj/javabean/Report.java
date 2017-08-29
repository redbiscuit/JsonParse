package com.bj.javabean;

import java.util.List;

/**
 * Created by JACKSON on 2017/8/29.
 */
public class Report {
    /**
     * Status : 1
     * Data : {"PageIndex":1,"RecordCount":240,"PageCount":10,"Rows":[{"period_no":"20170829001","director_profit_loss_money":"34775","bet_count":"230837","settlement_elapsed":"6228","draw_no":"2,3,2,9,2","open_datetime":"2017-08-29 00:00:00","close_datetime":"2017-08-29 00:04:00","draw_datetime":"2017-08-29 00:05:44","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829002","director_profit_loss_money":"-9087","bet_count":"220054","settlement_elapsed":"6625","draw_no":"9,2,6,1,9","open_datetime":"2017-08-29 00:05:00","close_datetime":"2017-08-29 00:09:00","draw_datetime":"2017-08-29 00:10:41","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829003","director_profit_loss_money":"6288","bet_count":"213868","settlement_elapsed":"9105","draw_no":"9,5,8,6,6","open_datetime":"2017-08-29 00:10:00","close_datetime":"2017-08-29 00:14:00","draw_datetime":"2017-08-29 00:15:59","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829004","director_profit_loss_money":"323","bet_count":"375","settlement_elapsed":"7089","draw_no":"3,2,1,1,9","open_datetime":"2017-08-29 00:15:00","close_datetime":"2017-08-29 00:19:00","draw_datetime":"2017-08-29 00:20:59","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829005","director_profit_loss_money":"-9873","bet_count":"224821","settlement_elapsed":"13539","draw_no":"2,7,8,9,7","open_datetime":"2017-08-29 00:20:00","close_datetime":"2017-08-29 00:24:00","draw_datetime":"2017-08-29 00:25:58","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829006","director_profit_loss_money":"-1346","bet_count":"507","settlement_elapsed":"293","draw_no":"7,4,5,8,2","open_datetime":"2017-08-29 00:25:00","close_datetime":"2017-08-29 00:29:00","draw_datetime":"2017-08-29 00:30:40","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829007","director_profit_loss_money":"-9123","bet_count":"208574","settlement_elapsed":"6030","draw_no":"4,6,9,3,9","open_datetime":"2017-08-29 00:30:00","close_datetime":"2017-08-29 00:34:00","draw_datetime":"2017-08-29 00:35:48","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829008","director_profit_loss_money":"100","bet_count":"100","settlement_elapsed":"289","draw_no":"3,2,1,7,9","open_datetime":"2017-08-29 00:35:00","close_datetime":"2017-08-29 00:39:00","draw_datetime":"2017-08-29 00:40:43","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829009","director_profit_loss_money":"-66925","bet_count":"224201","settlement_elapsed":"7681","draw_no":"0,4,3,6,4","open_datetime":"2017-08-29 00:40:00","close_datetime":"2017-08-29 00:44:00","draw_datetime":"2017-08-29 00:45:51","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829010","director_profit_loss_money":"-22178","bet_count":"219949","settlement_elapsed":"7042","draw_no":"1,2,3,5,4","open_datetime":"2017-08-29 00:45:00","close_datetime":"2017-08-29 00:49:00","draw_datetime":"2017-08-29 00:50:50","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829011","director_profit_loss_money":"-38985","bet_count":"214938","settlement_elapsed":"8144","draw_no":"9,0,3,7,8","open_datetime":"2017-08-29 00:50:00","close_datetime":"2017-08-29 00:54:00","draw_datetime":"2017-08-29 00:55:48","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829012","director_profit_loss_money":"48901","bet_count":"221235","settlement_elapsed":"8037","draw_no":"2,1,6,2,2","open_datetime":"2017-08-29 00:55:00","close_datetime":"2017-08-29 00:59:00","draw_datetime":"2017-08-29 01:00:46","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829013","director_profit_loss_money":"-7029","bet_count":"209100","settlement_elapsed":"7054","draw_no":"8,2,1,7,8","open_datetime":"2017-08-29 01:00:00","close_datetime":"2017-08-29 01:04:00","draw_datetime":"2017-08-29 01:05:44","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829014","director_profit_loss_money":"1","bet_count":"1","settlement_elapsed":"265","draw_no":"3,2,5,2,2","open_datetime":"2017-08-29 01:05:00","close_datetime":"2017-08-29 01:09:00","draw_datetime":"2017-08-29 01:10:49","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829015","director_profit_loss_money":"20994","bet_count":"228934","settlement_elapsed":"7518","draw_no":"5,6,1,6,1","open_datetime":"2017-08-29 01:10:00","close_datetime":"2017-08-29 01:14:00","draw_datetime":"2017-08-29 01:15:45","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829016","director_profit_loss_money":"53559","bet_count":"219734","settlement_elapsed":"9016","draw_no":"4,5,1,4,4","open_datetime":"2017-08-29 01:15:00","close_datetime":"2017-08-29 01:19:00","draw_datetime":"2017-08-29 01:20:44","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829017","director_profit_loss_money":"50055","bet_count":"223404","settlement_elapsed":"8165","draw_no":"8,8,0,9,7","open_datetime":"2017-08-29 01:20:00","close_datetime":"2017-08-29 01:24:00","draw_datetime":"2017-08-29 01:25:44","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829018","director_profit_loss_money":"51193","bet_count":"223052","settlement_elapsed":"8197","draw_no":"9,7,7,1,6","open_datetime":"2017-08-29 01:25:00","close_datetime":"2017-08-29 01:29:00","draw_datetime":"2017-08-29 01:30:52","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829019","director_profit_loss_money":"-9848","bet_count":"194008","settlement_elapsed":"7977","draw_no":"1,4,3,0,8","open_datetime":"2017-08-29 01:30:00","close_datetime":"2017-08-29 01:34:00","draw_datetime":"2017-08-29 01:35:51","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829020","director_profit_loss_money":"30004","bet_count":"213871","settlement_elapsed":"11464","draw_no":"3,9,3,0,7","open_datetime":"2017-08-29 01:35:00","close_datetime":"2017-08-29 01:39:00","draw_datetime":"2017-08-29 01:40:52","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829021","director_profit_loss_money":"0","bet_count":"0","settlement_elapsed":"246","draw_no":"2,5,0,9,9","open_datetime":"2017-08-29 01:40:00","close_datetime":"2017-08-29 01:44:00","draw_datetime":"2017-08-29 01:45:46","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829022","director_profit_loss_money":"-41186","bet_count":"221467","settlement_elapsed":"9685","draw_no":"1,8,5,6,8","open_datetime":"2017-08-29 01:45:00","close_datetime":"2017-08-29 01:49:00","draw_datetime":"2017-08-29 01:50:45","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829023","director_profit_loss_money":"-22871","bet_count":"221001","settlement_elapsed":"9002","draw_no":"7,6,1,5,8","open_datetime":"2017-08-29 01:50:00","close_datetime":"2017-08-29 01:54:00","draw_datetime":"2017-08-29 01:55:53","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829024","director_profit_loss_money":"-16402","bet_count":"351871","settlement_elapsed":"13679","draw_no":"1,8,7,0,3","open_datetime":"2017-08-29 09:50:00","close_datetime":"2017-08-29 09:59:00","draw_datetime":"2017-08-29 10:00:47","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829025","director_profit_loss_money":"149860","bet_count":"346005","settlement_elapsed":"13333","draw_no":"8,7,8,7,8","open_datetime":"2017-08-29 10:00:00","close_datetime":"2017-08-29 10:09:00","draw_datetime":"2017-08-29 10:10:42","period_status":"3","is_deleted":"0","enable_status":"1"}],"Extra":"2017-08-29 10:48:07"}
     */

    private int Status;
    private DataBean Data;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public DataBean getData() {
        return Data;
    }

    public void setData(DataBean Data) {
        this.Data = Data;
    }

    public static class DataBean {
        /**
         * PageIndex : 1
         * RecordCount : 240
         * PageCount : 10
         * Rows : [{"period_no":"20170829001","director_profit_loss_money":"34775","bet_count":"230837","settlement_elapsed":"6228","draw_no":"2,3,2,9,2","open_datetime":"2017-08-29 00:00:00","close_datetime":"2017-08-29 00:04:00","draw_datetime":"2017-08-29 00:05:44","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829002","director_profit_loss_money":"-9087","bet_count":"220054","settlement_elapsed":"6625","draw_no":"9,2,6,1,9","open_datetime":"2017-08-29 00:05:00","close_datetime":"2017-08-29 00:09:00","draw_datetime":"2017-08-29 00:10:41","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829003","director_profit_loss_money":"6288","bet_count":"213868","settlement_elapsed":"9105","draw_no":"9,5,8,6,6","open_datetime":"2017-08-29 00:10:00","close_datetime":"2017-08-29 00:14:00","draw_datetime":"2017-08-29 00:15:59","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829004","director_profit_loss_money":"323","bet_count":"375","settlement_elapsed":"7089","draw_no":"3,2,1,1,9","open_datetime":"2017-08-29 00:15:00","close_datetime":"2017-08-29 00:19:00","draw_datetime":"2017-08-29 00:20:59","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829005","director_profit_loss_money":"-9873","bet_count":"224821","settlement_elapsed":"13539","draw_no":"2,7,8,9,7","open_datetime":"2017-08-29 00:20:00","close_datetime":"2017-08-29 00:24:00","draw_datetime":"2017-08-29 00:25:58","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829006","director_profit_loss_money":"-1346","bet_count":"507","settlement_elapsed":"293","draw_no":"7,4,5,8,2","open_datetime":"2017-08-29 00:25:00","close_datetime":"2017-08-29 00:29:00","draw_datetime":"2017-08-29 00:30:40","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829007","director_profit_loss_money":"-9123","bet_count":"208574","settlement_elapsed":"6030","draw_no":"4,6,9,3,9","open_datetime":"2017-08-29 00:30:00","close_datetime":"2017-08-29 00:34:00","draw_datetime":"2017-08-29 00:35:48","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829008","director_profit_loss_money":"100","bet_count":"100","settlement_elapsed":"289","draw_no":"3,2,1,7,9","open_datetime":"2017-08-29 00:35:00","close_datetime":"2017-08-29 00:39:00","draw_datetime":"2017-08-29 00:40:43","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829009","director_profit_loss_money":"-66925","bet_count":"224201","settlement_elapsed":"7681","draw_no":"0,4,3,6,4","open_datetime":"2017-08-29 00:40:00","close_datetime":"2017-08-29 00:44:00","draw_datetime":"2017-08-29 00:45:51","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829010","director_profit_loss_money":"-22178","bet_count":"219949","settlement_elapsed":"7042","draw_no":"1,2,3,5,4","open_datetime":"2017-08-29 00:45:00","close_datetime":"2017-08-29 00:49:00","draw_datetime":"2017-08-29 00:50:50","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829011","director_profit_loss_money":"-38985","bet_count":"214938","settlement_elapsed":"8144","draw_no":"9,0,3,7,8","open_datetime":"2017-08-29 00:50:00","close_datetime":"2017-08-29 00:54:00","draw_datetime":"2017-08-29 00:55:48","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829012","director_profit_loss_money":"48901","bet_count":"221235","settlement_elapsed":"8037","draw_no":"2,1,6,2,2","open_datetime":"2017-08-29 00:55:00","close_datetime":"2017-08-29 00:59:00","draw_datetime":"2017-08-29 01:00:46","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829013","director_profit_loss_money":"-7029","bet_count":"209100","settlement_elapsed":"7054","draw_no":"8,2,1,7,8","open_datetime":"2017-08-29 01:00:00","close_datetime":"2017-08-29 01:04:00","draw_datetime":"2017-08-29 01:05:44","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829014","director_profit_loss_money":"1","bet_count":"1","settlement_elapsed":"265","draw_no":"3,2,5,2,2","open_datetime":"2017-08-29 01:05:00","close_datetime":"2017-08-29 01:09:00","draw_datetime":"2017-08-29 01:10:49","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829015","director_profit_loss_money":"20994","bet_count":"228934","settlement_elapsed":"7518","draw_no":"5,6,1,6,1","open_datetime":"2017-08-29 01:10:00","close_datetime":"2017-08-29 01:14:00","draw_datetime":"2017-08-29 01:15:45","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829016","director_profit_loss_money":"53559","bet_count":"219734","settlement_elapsed":"9016","draw_no":"4,5,1,4,4","open_datetime":"2017-08-29 01:15:00","close_datetime":"2017-08-29 01:19:00","draw_datetime":"2017-08-29 01:20:44","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829017","director_profit_loss_money":"50055","bet_count":"223404","settlement_elapsed":"8165","draw_no":"8,8,0,9,7","open_datetime":"2017-08-29 01:20:00","close_datetime":"2017-08-29 01:24:00","draw_datetime":"2017-08-29 01:25:44","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829018","director_profit_loss_money":"51193","bet_count":"223052","settlement_elapsed":"8197","draw_no":"9,7,7,1,6","open_datetime":"2017-08-29 01:25:00","close_datetime":"2017-08-29 01:29:00","draw_datetime":"2017-08-29 01:30:52","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829019","director_profit_loss_money":"-9848","bet_count":"194008","settlement_elapsed":"7977","draw_no":"1,4,3,0,8","open_datetime":"2017-08-29 01:30:00","close_datetime":"2017-08-29 01:34:00","draw_datetime":"2017-08-29 01:35:51","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829020","director_profit_loss_money":"30004","bet_count":"213871","settlement_elapsed":"11464","draw_no":"3,9,3,0,7","open_datetime":"2017-08-29 01:35:00","close_datetime":"2017-08-29 01:39:00","draw_datetime":"2017-08-29 01:40:52","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829021","director_profit_loss_money":"0","bet_count":"0","settlement_elapsed":"246","draw_no":"2,5,0,9,9","open_datetime":"2017-08-29 01:40:00","close_datetime":"2017-08-29 01:44:00","draw_datetime":"2017-08-29 01:45:46","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829022","director_profit_loss_money":"-41186","bet_count":"221467","settlement_elapsed":"9685","draw_no":"1,8,5,6,8","open_datetime":"2017-08-29 01:45:00","close_datetime":"2017-08-29 01:49:00","draw_datetime":"2017-08-29 01:50:45","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829023","director_profit_loss_money":"-22871","bet_count":"221001","settlement_elapsed":"9002","draw_no":"7,6,1,5,8","open_datetime":"2017-08-29 01:50:00","close_datetime":"2017-08-29 01:54:00","draw_datetime":"2017-08-29 01:55:53","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829024","director_profit_loss_money":"-16402","bet_count":"351871","settlement_elapsed":"13679","draw_no":"1,8,7,0,3","open_datetime":"2017-08-29 09:50:00","close_datetime":"2017-08-29 09:59:00","draw_datetime":"2017-08-29 10:00:47","period_status":"3","is_deleted":"0","enable_status":"1"},{"period_no":"20170829025","director_profit_loss_money":"149860","bet_count":"346005","settlement_elapsed":"13333","draw_no":"8,7,8,7,8","open_datetime":"2017-08-29 10:00:00","close_datetime":"2017-08-29 10:09:00","draw_datetime":"2017-08-29 10:10:42","period_status":"3","is_deleted":"0","enable_status":"1"}]
         * Extra : 2017-08-29 10:48:07
         */

        private int PageIndex;
        private int RecordCount;
        private int PageCount;
        private String Extra;
        private List<RowsBean> Rows;

        public int getPageIndex() {
            return PageIndex;
        }

        public void setPageIndex(int PageIndex) {
            this.PageIndex = PageIndex;
        }

        public int getRecordCount() {
            return RecordCount;
        }

        public void setRecordCount(int RecordCount) {
            this.RecordCount = RecordCount;
        }

        public int getPageCount() {
            return PageCount;
        }

        public void setPageCount(int PageCount) {
            this.PageCount = PageCount;
        }

        public String getExtra() {
            return Extra;
        }

        public void setExtra(String Extra) {
            this.Extra = Extra;
        }

        public List<RowsBean> getRows() {
            return Rows;
        }

        public void setRows(List<RowsBean> Rows) {
            this.Rows = Rows;
        }

        public static class RowsBean {
            /**
             * period_no : 20170829001
             * director_profit_loss_money : 34775
             * bet_count : 230837
             * settlement_elapsed : 6228
             * draw_no : 2,3,2,9,2
             * open_datetime : 2017-08-29 00:00:00
             * close_datetime : 2017-08-29 00:04:00
             * draw_datetime : 2017-08-29 00:05:44
             * period_status : 3
             * is_deleted : 0
             * enable_status : 1
             */

            private String period_no;
            private String director_profit_loss_money;
            private String bet_count;
            private String settlement_elapsed;
            private String draw_no;
            private String open_datetime;
            private String close_datetime;
            private String draw_datetime;
            private String period_status;
            private String is_deleted;
            private String enable_status;

            public String getPeriod_no() {
                return period_no;
            }

            public void setPeriod_no(String period_no) {
                this.period_no = period_no;
            }

            public String getDirector_profit_loss_money() {
                return director_profit_loss_money;
            }

            public void setDirector_profit_loss_money(String director_profit_loss_money) {
                this.director_profit_loss_money = director_profit_loss_money;
            }

            public String getBet_count() {
                return bet_count;
            }

            public void setBet_count(String bet_count) {
                this.bet_count = bet_count;
            }

            public String getSettlement_elapsed() {
                return settlement_elapsed;
            }

            public void setSettlement_elapsed(String settlement_elapsed) {
                this.settlement_elapsed = settlement_elapsed;
            }

            public String getDraw_no() {
                return draw_no;
            }

            public void setDraw_no(String draw_no) {
                this.draw_no = draw_no;
            }

            public String getOpen_datetime() {
                return open_datetime;
            }

            public void setOpen_datetime(String open_datetime) {
                this.open_datetime = open_datetime;
            }

            public String getClose_datetime() {
                return close_datetime;
            }

            public void setClose_datetime(String close_datetime) {
                this.close_datetime = close_datetime;
            }

            public String getDraw_datetime() {
                return draw_datetime;
            }

            public void setDraw_datetime(String draw_datetime) {
                this.draw_datetime = draw_datetime;
            }

            public String getPeriod_status() {
                return period_status;
            }

            public void setPeriod_status(String period_status) {
                this.period_status = period_status;
            }

            public String getIs_deleted() {
                return is_deleted;
            }

            public void setIs_deleted(String is_deleted) {
                this.is_deleted = is_deleted;
            }

            public String getEnable_status() {
                return enable_status;
            }

            public void setEnable_status(String enable_status) {
                this.enable_status = enable_status;
            }
        }
    }
}
