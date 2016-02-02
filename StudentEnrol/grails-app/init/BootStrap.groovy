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
    }
    def destroy = {
    }
}
