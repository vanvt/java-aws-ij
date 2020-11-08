import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class S3Client {
    public static void main(String[] args) {
        AmazonS3 s3client = AmazonS3ClientBuilder.defaultClient();

    }
}
