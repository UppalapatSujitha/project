import matplotlib.pyplot as plt

#pass the x and y cordinates of the bars to the function.the label argument gives a label to th data

plt.bar([1,3,5,7,9],[5,2,7,8,2],label="Data 1")
plt.legend()

plt.xlabel('x values')
plt.ylabel('Height')
plt.title('vertical bar chart')
plt.show()