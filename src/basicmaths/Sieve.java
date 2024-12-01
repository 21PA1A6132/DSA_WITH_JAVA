package basicmaths;

import java.util.*;

class Sieve {
    public static ArrayList<Integer> sievePrimes(int N) {
        int[] primes = new int[N+1];

        Arrays.fill(primes,1);

        primes[0]=primes[1]=0;

        for (int i = 2; i *i<= N; i++) {

            for(int j = i*i;j<=N;j+=i){
                primes[j]=0;
            }
        }
        ArrayList<Integer> PrimesList = new ArrayList<Integer>();
        for(int i=2;i<=N;i++){
            if(primes[i]==1){
                PrimesList.add(i);
            }
        }
        return PrimesList;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        ArrayList<Integer> primes = sievePrimes(N);
        System.out.println("Prime numbers up to " + N + " are: " + primes);
    }
}

