public class Review
{
    private int rating;
    private String comment;

    public Review(int r, String o)
    {
        rating = r;
        comment = o;
    }

    public int getRating()
    {
        return rating;
    }

    public String getComment()
    {
        return comment;
    }
    
}