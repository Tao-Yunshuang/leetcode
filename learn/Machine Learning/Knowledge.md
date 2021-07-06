Machine Learning Model:

A machine learning algorithm is the process that uncovers the underlying relationship within the data. 

The outcome of a machine learning algorithm is called machine learning model, which can be considered as a function 
F
F, which outputs certain results, when given the input.

Rather than a predefined and fixed function, a machine learning model is derived from historical data. Therefore, when fed with different data, the output of machine learning algorithm changes, i.e. the machine learning model changes.

The task of machine learning, is to learn the function, from the vast mapping space.

Supervised Learning:

In a supervised learning task, the data sample would contain a target attribute y, also known as ground truth. And the task is to learn a function F, that takes the non-target attributes X and output a value that approximates the target attribute, i.e. F(X)≈y. The target attribute y serves as a teacher to guide the learning task, since it provides a benchmark on the results of learning. Hence, the task is called supervised learning.

Unsupervised Learning:

In contrary to the supervised learning task, we do not have the ground truth in an unsupervised learning task. One is expected to learn the underlying patterns or rules from the data, without having the predefined ground truth as the benchmark.

Clustering: given a data set, one can cluster the samples into groups, based on the similarities among the samples within the data set.

Association:  given a data set, the association task is to uncover the hidden association patterns among the attributes of a sample.

Semi-supervised Learning:

By combining both the supervised and unsupervised learning in a data set with few labels, one could exploit the data set to a better extend and obtain a better result than just applying each of them individually.

Classification VS. Regression:

If the output of a machine learning model is discrete values, e.g. a boolean value, we then call it a classification model. While we call the model that outputs continuous values as regression model.

Data-Centric Workflow:

Starting from the data, we first determine which type of machine learning problems we would like to solve, i.e. supervised vs. unsupervised.

For the supervised machine learning algorithms, we further determine the type of the generated model: classification or regression, based on the expected output of the model.

Once we determine on the type of model that we would like to build out of the data, we then go ahead to perform the feature engineering, which is a group of activities that transform the data into the desired format. Here are a few examples:

For almost all cases, we split the data into two groups: training and testing. The training dataset is used during the process to train a model, while the testing dataset is then used to test or validate whether the model we build is generic enough that can be applied to the unseen data.

The raw dataset is often incomplete with missing values. Therefore, one might need to fill those missing values with various strategies such as filling with the average value.

The dataset often contains categorical attributes, such as country, gender etc. And it is often the case that one needs to encode those categorical string values into numerical one, due to the constraints of algorithm.

Once the data is ready, we then select one of the machine learning algorithms, and start to feed the algorithm with the prepared training data. This is what we call the training process.

Once we obtain our model at the end of the training process, we then test the model with the reserved testing data. This is what we call the testing process.

Underfitting:

An underfitting model is the one that does not fit well with the training data, i.e. significantly deviated from the ground truth. 

One of the causes of underfitting could be that the model is over-simplified for the data, therefore it is not capable to capture the hidden relationship within the data.

As a countermeasure to avoid the above cause of underfitting, one can choose an alternative algorithm that is capable to generate a more complex model from the training data set.

Overfitting:

An overfitting model is the one that fits well with the training data, i.e. little or no error, however it does not generalized well to the unseen data.

Contrary to the case of underfitting, an over-complicated model that is able to fit every bit of the data, would fall into the traps of noises and errors.

Similarly with the underfitting case, to avoid the overfitting, one can try out another algorithm that could generate a simpler model from the training data set. Or more often, one stays with the original algorithm that generated the overfitting model, but adds a regularization term to the algorithm, i.e. penalizing the model that is over-complicated so that the algorithm is steered to generate a less complicated model while fitting the data.

Bias:

In a word, the bias of a learner, with regards to an example, is the loss incurred by the difference between the main prediction (the general tendency) and the actual value of the target attribute (target value).

Variance:

In a word, 
V(xi) measures the loss incurred by its fluctuation around the main prediction in response to different training sets.

Bias-Variance Tradeoff:

Bias is reduced and variance is increased in relation to the complexity of the models produced by a learner.
