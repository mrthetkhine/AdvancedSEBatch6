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
let females = [];
for(const stuent of students)
{
    if(stuent.gender == "Female")
    {
        females.push(stuent);
    }
}
console.log('Females ',females);
let youngestFemale = females[0];
for(const female of females)
{
    if(female.age < youngestFemale.age)
    {
        youngestFemale = female;
    }
}
console.log('Youngest Female ',youngestFemale);