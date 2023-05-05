def printFirstNegativeInteger( A, N, K):
    arr=[]
    q=[]
    i,j=0,0
    while j<N:
        if A[j]<0:
            q.append(A[j])
        if j-i+1<K:
            j+=1
        elif j-i+1==K:
            if len(q)==0:
                arr.append(0)
            else:
                arr.append(q[0])
                if A[i]==q[0]:
                    q.pop(0)
            i+=1
            j+=1
    return arr
    # code here