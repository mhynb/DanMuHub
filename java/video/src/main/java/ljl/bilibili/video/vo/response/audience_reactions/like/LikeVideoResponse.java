package ljl.bilibili.video.vo.response.audience_reactions.like;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import ljl.bilibili.serializer.RemoveTSerializer;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LikeVideoResponse {
    @ApiModelProperty("视频id")
    private int videoId;
    @ApiModelProperty("视频名字")
    private String name;
    @ApiModelProperty("创建时间")
    @JsonSerialize(using = RemoveTSerializer.class)
    private LocalDateTime createTime;
    @ApiModelProperty("视频时长")
    private String length;
    @ApiModelProperty("视频播放量")
    private int playCount;
    @ApiModelProperty("弹幕量")
    private int danmakuCount;
    @ApiModelProperty("封面")
    private int coverUrl;
}
