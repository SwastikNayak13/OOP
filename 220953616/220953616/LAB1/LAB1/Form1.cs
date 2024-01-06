using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LAB1
{
    public partial class Form1 : Form
    {
        string input = string.Empty;
        string Op1 = string.Empty;
        string Op2 = string.Empty;
        char Operator;
        double res = 0.0;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "7";
            this.textBox1.Text += input;

        }

        private void textBox1_TextChanged_1(object sender, EventArgs e)
        {

        }

        private void cmd1_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "1";
            this.textBox1.Text+=input;

        }

        private void cmd2_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "2";
            this.textBox1.Text += input;

        }

        private void cmd3_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "3";
            this.textBox1.Text += input;

        }

        private void cmd4_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "4";
            this.textBox1.Text += input;

        }

        private void cmd5_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "5";
            this.textBox1.Text += input;

        }

        private void cmd6_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "6";
            this.textBox1.Text += input;

        }

        private void cmd8_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "8";
            this.textBox1.Text += input;

        }

        private void cmd9_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "9";
            this.textBox1.Text += input;

        }

        private void cmd0_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = string.Empty;
            input = input + "0";
            this.textBox1.Text += input;

        }

        private void cmdmultiply_Click(object sender, EventArgs e)
        {
            Op1 = input;
            Operator = '*';
            input = string.Empty;
        }

        private void cmdadd_Click(object sender, EventArgs e)
        {
            Op1 = input;
            Operator = '+';
            input = string.Empty;
        }

        private void cmdsubtract_Click(object sender, EventArgs e)
        {
            Op1 = input;
            Operator = '-';
            input = string.Empty;
        }

        private void cmddivide_Click(object sender, EventArgs e)
        {
            Op1 = input;
            Operator = '/';
            input = string.Empty;
        }

        private void cmdsum_Click(object sender, EventArgs e)
        {
            Op2 = input;
          
double num1, num2;
double.TryParse(Op1, out num1);
double.TryParse(Op2, out num2);
if (Operator == '+')
{
res = num1 + num2;
this.textBox1.Text = res.ToString();
}
else if (Operator == '-')
{
res = num1 - num2;
textBox1.Text = res.ToString();
}
else if (Operator == '*')
{
res = num1 * num2;
textBox1.Text = res.ToString();}
else if (Operator == 's')
{
    res = Math.Sqrt(num1);
    textBox1.Text = res.ToString();
}
else if(Operator=='f'){
    res=1;
    for(double i=num1;i>0;i--)
        res=res*i;
    textBox1.Text=res.ToString();
}

else if (Operator == 'e')
{
    res=Math.Exp(num1);
    textBox1.Text = res.ToString();
    
}

else if (Operator == 'l')
{
    res = Math.Log10(num1);
    textBox1.Text = res.ToString();
}
else if (Operator == '/')
{
    if (num2 != 0)
    {
        res = num1 / num2;
        textBox1.Text = res.ToString();
    }
    else
    {
        textBox1.Text = "DIV/Zero!";
    }
}
input = string.Empty;


        }

        private void cmdCLR_Click(object sender, EventArgs e)
        {
            textBox1.Text = string.Empty;
            string Op1 = string.Empty;
            string Op2 = string.Empty;
            input = string.Empty;
        }

        private void cmdsqrt_Click(object sender, EventArgs e)
        {
            Op1 = input;
            Operator = 's';
            input = string.Empty;
        }

        private void cmdfact_Click(object sender, EventArgs e)
        {
              Op1 = input;
            Operator = 'f';
            input = string.Empty;
        }

        private void cmdEXP_Click(object sender, EventArgs e)
        {
            Op1 = input;
            Operator = 'e';
            input = string.Empty;
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            Op1 = input;
            Operator = 'l';
            input = string.Empty;
        }
        
        
        
    }
}
