// problem link
// https://www.codechef.com/START132D/problems/CHANGE_PLZ

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here

	int t;
	cin >> t;
	while(t--){
	    int n;
	    cin >> n;
	    n = 100-n;

	    n /= 10;
	    n *= 10;
	    cout << n << endl;
	}

}
