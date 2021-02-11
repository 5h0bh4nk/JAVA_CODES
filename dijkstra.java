
public class dijkstra {
    public static void main(String args[])
    {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                    { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                    { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                    { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                    { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                    { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                    { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                    { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
                                    { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        int []dist= new int[9];
        boolean vis[]= new boolean [9];
        

        for(int i=0 ;i<9 ;i++)
        {
            dist[i]=Integer.MAX_VALUE;
            vis[i]=false;
        }
        dist[0]=0;
        mindistance(graph,dist,vis,0);

        System.out.println(dist[4]);
    }    

    static void mindistance(int[][] G,int[] dist,boolean vis[],int src)
    {
        for(int i=0 ; i<G[src].length ;i++)
        {
            if(G[src][i]!=0 && dist[i]>G[src][i]+dist[src])
            {
                dist[i]=G[src][i]+dist[src];
                mindistance(G, dist, vis, i);
            }
        }
        vis[src]=true;
    }
}
