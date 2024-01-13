using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentRegistration
{
    public partial class Form1 : Form
    {
        String Gen;
        String name;
        Object s;
        Object dob;
        String I="";
        public Form1()
        {
            InitializeComponent();
        }

        private void checkBox7_CheckedChanged(object sender, EventArgs e)
        {
            I = I + "SDT ";
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show(name+"\n"+dob+"\n"+Gen+"\n"+s+"\n"+I+"\n"+"Confirm Submission?","Confirmation",MessageBoxButtons.YesNo,MessageBoxIcon.Question,MessageBoxDefaultButton.Button3);
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            s = comboBox1.SelectedItem;
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            name = textBox2.Text;
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            Gen = "Male ";
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            Gen = "Female";
        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            dob = dateTimePicker1.Text;
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            I = I + "OS LAB ";
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            I = I + "DBMS LAB ";
        }

        private void checkBox4_CheckedChanged(object sender, EventArgs e)
        {
            I = I + "OS ";
        }

        private void checkBox3_CheckedChanged(object sender, EventArgs e)
        {
            I = I + "DBMS ";
        }

        private void checkBox5_CheckedChanged(object sender, EventArgs e)
        {
            I = I + "DAA ";
        }

        private void checkBox6_CheckedChanged(object sender, EventArgs e)
        {
            I = I + "CNP ";
        }

        private void checkBox8_CheckedChanged(object sender, EventArgs e)
        {
            I = I + "MATH IV ";
        }
    }
}
