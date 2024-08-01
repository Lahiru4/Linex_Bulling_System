package lk.linex.bilingsystem.reqAndresp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class JwtAuthResponse {
    private String error;
    private String token;
    private String shopId;
    private String userId;
}
