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
            String hyphen = "-";
            if (toAdd.length() > 0) arr.add(r.getRating() + hyphen + toAdd);
        }
        for (int i = arr.size() - 1; i >= 0; i--)
        {
            String comment = arr.get(i);
            boolean hasExclaim = false;
            for (int o = 0; o < comment.length(); o++)
            {
                if (comment.substring(o,o + 1).equals("!")) hasExclaim = true;
            }
            if (!hasExclaim)
            {
                arr.remove(i);
            }
        }
        return arr;
    }
}