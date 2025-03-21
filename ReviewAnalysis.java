public class ReviewAnalysis
{
    private Review[] allReviews;

    public ReivewAnalysis(Review[] reviews)
    {
        allReviews = reviews;
    }

    public double getAverageRating(Review[] reviews)
    {
        double average = 0;
        int count = 0;
        for (Review r : reviews)
        {
            count++;
            average += r.getRating();
        }
        return average/count;
    }

    public ArrayList<String> collectComments()
    {
        return null;
    }
}