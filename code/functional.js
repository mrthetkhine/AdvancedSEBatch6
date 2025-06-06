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
let youngestFemale = students.filter(stu=>stu.gender == "Female")
                            .reduce((a,b)=>{
                                    return a.age < b.age ? a:b;
                            });
console.log('Youngest ',youngestFemale);