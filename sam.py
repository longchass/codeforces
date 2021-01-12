dict = {
	"a" : [1,2],
	"b" : [1]

}
result = {v: k for k, v in dict.items()}


print (result)