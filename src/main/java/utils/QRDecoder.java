package utils;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class QRDecoder {

    public static String QRReader(File file) {
        BufferedImage bf;
        Result result;
        try {
            bf = ImageIO.read(file);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(bf)));
            result = new MultiFormatReader().decode(bitmap);
        } catch (IOException | NotFoundException e) {
            throw new RuntimeException(e);
        }
        return result.getText();
    }

}
