# OOP class and object concept
class student:
    stream = "Computing" # class attribute / properties
    index_to_subject = {0: "Computational Mathematics", 
                       1: "Algorithms Analysis",
                       2: "Advance Data Structures",
                       3: "Artificial Intelligence",
                       4: "Advance Database"}
    
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks
        self.marks_dict = {}
        for i in range(len(self.marks)):
            self.marks_dict[student.index_to_subject[i]] = self.marks[i]
            self.total = 0
            
    def percentage(self):
        percent = sum(self.marks) / (len(self.marks) * 100) * 100
        return percent
    
    def get_grades(self):
        avg = sum(self.marks)/len(self.marks)
        if avg <= 40:
            return "Grade: F"
        elif avg > 40 and avg <= 50:
            return "Grade: Pass"
        elif avg > 50 and avg <= 60:
            return "Grade: Third Class Honours Division"
        elif avg > 60 and avg <= 70:
            return "Grade: Second Class B Honours Division"
        elif avg > 70 and avg <= 80:
            return "Grade: Second Class A Honours Division"
        elif avg > 80 and avg <= 100:
            return "Grade: First Class Honours Division"
        else:
            return "Invalid!"

std1 = student("John Doe", [81, 87, 76, 85, 76])
print(student.stream, ":", std1.marks_dict)
print(std1.percentage())
print(std1.get_grades())
