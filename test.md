前9轮的3个情况
##1
Given not hit 10 pins after two throw
When score
Then number of pins

##2
Given strike(first throw hit 10 pins)
When score
Then 10 and next two frame score

##3
Given spare(two throw hit 10 pins)
When score
Then 10 and next frame score

最后一轮，即第10轮的3种情况
##1
Given not hit 10 pins after two throw
When score
Then number of pins

##2
Given strike(first throw hit 10 pins)
When score
Then 10 and two throw = one frame scores

##3
Given spare(two throw hit 10 pins)
When score
Then 10 and nest throw scores