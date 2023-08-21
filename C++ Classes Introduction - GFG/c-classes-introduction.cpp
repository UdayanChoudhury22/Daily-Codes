//{ Driver Code Starts
//Initial Template for C++
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class CollegeCourse
{
    string courseID;
    char grade;
    int credits;
    int gradePoints;
    float honorPoints;
    public:
    void set_CourseId(string CID){
        courseID = CID;
    }
    void set_Grade(char g){
        grade = g;
    }
    void set_Credit(int cr){
        credits = cr;
    }
    int calculateGradePoints(char g){
        return gradePoints = 75 - toupper(g);
    }
    int calculateHonorPoints(int gp, int cr){
        return honorPoints = gp * cr;
    }
    
    void display(){
        cout << gradePoints << " " << honorPoints << endl;
    }
    
    
    
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
    CollegeCourse cc;
    string courseId;
    int gp;
    char grade;
    int credits;
    cin>>courseId>>grade>>credits;
    cc.set_CourseId(courseId);
    cc.set_Grade(grade);
    cc.set_Credit(credits);
    gp=cc.calculateGradePoints(grade);
    cc.calculateHonorPoints(gp,credits);
    cc.display();
    }
    return 0;
}

// } Driver Code Ends