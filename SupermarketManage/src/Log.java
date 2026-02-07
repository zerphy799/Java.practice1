import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Log {
    private String id;
    private String title;
    private String  description;
    private String  date;
    private Boolean success;
    private int logType;
    private String[] fix ={"收银员管理模块日志","商品维护日志","商品分类维护日志"};
    public static List<Log> logs = new ArrayList<>();

    public String getDate() {
        return date;
    }

    public void setDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd HH时mm分ss秒");
        this.date = formatter.format(dateTime);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLogType() {
        return logType;
    }

    public void setLogType(int logType) {
        this.logType = logType;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Log(String id, int logType, Boolean success, String title, String description) {
        this.id = id;
        this.logType = logType;
        this.success = success;
        this.title = title;
        this.description = description;
        setDate();
    }

    public static void add(String id, int logType, Boolean success, String title, String description) {
        Log log = new Log(id, logType, success, title, description);
        logs.add(log);
    }
    public static List<Log> getLogs() {
        return logs;
    }

    @Override
    public String toString() {
        if(success) {
            return id + "\t" +
                    date + "\t" +
                    "   " + fix[logType - 1] + "\t" +
                    "\t" + "成功" +
                    "   " + title + " :" +
                    description;
        }else{
            return id + "\t" +
                    date + "\t" +
                    "   " + fix[logType - 1] + "\t" +
                    "\t" + "没有成功" +
                    "   " + title + " :" +
                    description;
        }
        }
}
