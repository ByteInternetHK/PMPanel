package project.daihao18.panel.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: client
 * @Description:
 * @Author: code18
 * @Date: 2020-10-07 21:05
 */
@Data
@ToString
@Component
public class Client implements Serializable {

    // API 地址
    private String baseUrl;

    // Clash 的 Proxy名称
    private String subecribeRule;

    // 启动图和跳转url
    private String bootstrapShow;

    private String bootstrapImg;

    private String bootstrapUrl;

    // android的公告
    private Boolean broadShow;

    private String title;

    private String content;

    private String broadUrl;

    // android的版本
    private String versionCode;

    private String description;

    private String download;

    // pc的公告
    private Boolean pcAnnoShow;

    private String pcAnnoTitle;

    private String pcAnnoContent;

    // pc的版本
    private String pcUpdateVersionCode;

    private String pcUpdateDescription;

    private String pcUpdateDownload;

    private String pcUpdateDownloadMac;

    // 其他设置

    private Map<String, Object> bootstrap;

    private List<Map<String, Object>> nav;

    private Map<String, Object> levelDesc;

    private Boolean holdConnect;

    private Integer userinfoFrq;

    private Integer onlineinfoFrq;

    private Map<String, Object> online;

    private static final long serialVersionUID = 1L;
}