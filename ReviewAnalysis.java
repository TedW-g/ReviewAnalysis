import java.util.ArrayList;
public class ReviewAnalysis
{
    private Review[] allReviews;

    public ReviewAnalysis(Review[] reviews)
    {
        allReviews = reviews;
    }

    public double getAverageRating()
    {
        double average = 0;
        int count = 0;
        for (Review r : allReviews)
        {
            count++;
            average += r.getRating();
        }
        return average/count;
    }

    public ArrayList<String> collectComments() //we up to here
    {
        ArrayList<String> arr = new ArrayList<String>();
        for (Review r : allReviews)
        {
            String toAdd = r.getComment();
            arr.add(toAdd);
        }
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i))
        }
        return null;
    }
}