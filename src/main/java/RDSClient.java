
import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.AmazonRDSClientBuilder;
import com.amazonaws.services.rds.model.DescribeDBSnapshotsResult;

public class RDSClient {
    public static void main(String[] args) {
        final AmazonRDS amazonRDS = AmazonRDSClientBuilder.standard().build();
        DescribeDBSnapshotsResult describeDBSnapshotsResult = amazonRDS.describeDBSnapshots();

    }
}
