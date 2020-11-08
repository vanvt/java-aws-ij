import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.DescribeVolumesRequest;
import com.amazonaws.services.ec2.model.DescribeVolumesResult;
import com.amazonaws.services.ec2.model.Filter;
import com.amazonaws.services.ec2.model.Volume;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {

        final AmazonEC2 ec2 = AmazonEC2ClientBuilder.standard().build();
        DescribeVolumesRequest request = new DescribeVolumesRequest();
        Filter filter = new Filter();
        filter.setName("encrypted");
        List<String> strings = new ArrayList<>();
        strings.add("false");
        filter.setValues(strings);
        List<Filter> filters = new ArrayList<>();
        filters.add(filter);
        request.setFilters(filters);
        DescribeVolumesResult describeVolumesResult = ec2.describeVolumes(request);

        List<Volume> volumes = describeVolumesResult.getVolumes();
        volumes.stream().forEach(t ->{
            System.out.println(t.getEncrypted());
        });
    }
}
