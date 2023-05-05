class Solution:
    def maximumSumSubarray (self,K,Arr,N):
        # code here 
        w=Arr[0:K]
        wi=sum(w)
        m=wi
        for i in range(0,N-K):
            wi=wi-Arr[i]+Arr[i+K]
            m=max(wi,m)
        return m

