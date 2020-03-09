package pqdong.movie.recommend.domain.user;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// 自动生成无参数构造函数
@NoArgsConstructor
// 自动生成全参数构造函数
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
// 用户详情信息
public class UserInfo {

    private long id;

    private String userMd;

    // 用户昵称
    private String userNickName;

    // 用户头像
    private String userAvatar;

    // 用户标签
    private String userTags;

    private String username;

    private String password;
}