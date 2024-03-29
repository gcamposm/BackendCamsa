package ventas.backend.SQL.services;

import ventas.backend.ZXingHelper;
import org.springframework.stereotype.Service;

@Service
public class BarCodeService {

    public byte[] getBarCodeImage(String code, int width, int height){
        return ZXingHelper.getBarCodeImage(code, width, height);
    }
}
