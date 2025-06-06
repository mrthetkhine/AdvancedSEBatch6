let students =[
    {
        name: "Mg Mg",
        gender:"Male",
        age : 30,
    },
    {
        name: "Win Win",
        gender:"Female",
        age : 35,
    },    
    {
        name: "Mya Mg",
        gender:"Male",
        age : 21,
    },
    {
        name: "Tin Tin",
        gender:"Female",
        age : 16,
    }, 
    {
        name: "Hla Hla",
        gender:"Female",
        age : 20,
    },  
         
]
class YoungestFemaleFinder
{
    constructor(students) {
        this.students = students;
        
    }
    getFemales()
    {
        let females = [];
        for(const stuent of this.students)
        {
            if(stuent.gender == "Female")
            {
                females.push(stuent);
            }
        }
        return females;
    }
    getYoungestFemale()
    {
        let females = this.getFemales();
        let youngestFemale = females[0];
        for(const female of females)
        {
            if(female.age < youngestFemale.age)
            {
                youngestFemale = female;
            }
        }
        return youngestFemale;
    }
}
let finder = new YoungestFemaleFinder(students);
let youngestFemale = finder.getYoungestFemale();
console.log(youngestFemale);