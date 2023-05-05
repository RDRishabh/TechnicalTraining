class Solution:
    def search(self,pat, txt):
	    c=0
        d=dict()
        a='abcdefghijklmnopqrstuvwxyz'
        for i in a:
            d[i]=0
        for i in pat:
            d[i]=d[i]+1
        d2=dict()
        for i in a:
            d2[i]=0
        for i in range(len(pat)):
            d2[txt[i]]=d2[txt[i]]+1
        j=len(pat)-1
        i=0
        while j < len(txt):
            if d2==d:
                c=c+1
            d2[txt[i]]=d2[txt[i]]-1
            i=i+1
            j=j+1
            if j < len(txt):
                d2[txt[j]]=d2[txt[j]] + 1
            
        return c
	    # code here