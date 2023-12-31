//{ Driver Code Starts
//Initial Template for C++

#include <iostream>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Cuboid 
{
   //Add your code here.
   public:
   int length;
   int width;
   int height;
   void display(){
       
       cout<<length<<" "<<width<<" "<<height<<endl;
   }
};

class CuboidVol: public Cuboid
{
    //Add your code here.
    public:
    void read_input(int length,int width, int height){
        this->length=length;
        this->width=width;
        this->height=height;
    }
    void display() const {
        cout << length * width * height << '\n';
    }
};

//{ Driver Code Starts.


int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int l, w, h;
        cin>>l>>w>>h;
    
    // Declare a CuboidVol object
    
    CuboidVol c_vol;
    
    
    // Read length width and height
     
    c_vol.read_input(l,w,h);
    
    
    //  Print length, width and height
    
    c_vol.Cuboid::display();
    
    
    // Print the Volume
     
    c_vol.display();
    }
    
    return 0;
}
// } Driver Code Ends