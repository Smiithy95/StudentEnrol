import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
               def course1=new Course(title: 'Interactive Media with Animation',
                                department: 'Computing',
                               description: '"Lorem Ipsum dolor sit emat, ad sea solum brute sensibus"',
                                    leader: 'Joe Jojo',
                                      code: 'IMA101',
                                 startDate: new Date('19/01/2015'),
                                   endDate: new Date('19/01/2020')).save()

              def course2=new Course(title: 'Fine Art',
                                department: 'Arts',
                               description: '"Lorem Ipsum dolor sit emat, ad sea solum brute sensibus"',
                                    leader: 'Vincent Van Gogh',
                                      code: 'FA101',
                                 startDate: new Date('25/01/2015'),
                                   endDate: new Date('25/01/2019')).save()

              def course3=new Course(title: 'Success and Loyalty',
                                department: 'Blessing Up',
                               description: '"Lorem Ipsum dolor sit emat, ad sea solum brute sensibus"',
                                    leader: 'DJ Khaled',
                                      code: 'DJK101',
                                 startDate: new Date('10/01/2015'),
                                   endDate: new Date('10/01/2018')).save()
    
               def student1=new Student(name: 'Will Smith',
                                  studentid: '24025516',
                                      email: 'william.smith4@student.shu.ac.uk',
                                   username: 'Smiithy95',
                                   password: 'AnotherOne',
                                     course: 'BSc Computing',
                                        dob: new Date('02/09/1995')).save()

               def student2=new Student(name: 'Chris Swinden',
                                  studentid: '24025617',
                                      email: 'chris.swinden2@student.shu.ac.uk',
                                   username: 'SwiNi19',
                                   password: 'JonnynnoJ',
                                     course: 'Aldi Banter',
                                        dob: new Date('19/02/1996')).save()

               def student3=new Student(name: 'Tom Oxspring',
                                  studentid: '24025345',
                                      email: 'tom.Ox5@student.shu.ac.uk',
                                   username: 'ThomasTheDank1',
                                   password: 'Faggot',
                                     course: 'Whipped by Walker',
                                        dob: new Date('28/08/1996')).save()
}

    def destroy = {
    }
}
